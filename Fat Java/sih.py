
from flask import Flask, request, jsonify
from PIL import Image
import numpy as np
import requests
from io import BytesIO

app = Flask(__name__)

def calculate_pixels(image_url):
    # Download the image from the URL
    response = requests.get(image_url)
    
    if response.status_code != 200:
        return jsonify({'error': 'Failed to download image from the URL'})

    # Open the image
    image = Image.open(BytesIO(response.content))

    # Get the image size (width x height)
    width, height = image.size

    image = image.convert('L')

    # Calculate the total number of pixels
    total_pixels = width * height

    # Convert the image to a NumPy array for efficient pixel-wise operations
    pixels = np.array(image)

    # Calculate the number of white pixels (assuming white is represented by 255 in a grayscale image)
    white_pixels = np.count_nonzero(pixels == 255)

    return total_pixels, white_pixels

@app.route('/analyze', methods=['POST'])
def analyze_image():
    # Get the image URL from the request
    image_url = request.json.get('image_url', '')

    if not image_url:
        return jsonify({'error': 'Image URL is missing'})

    # Calculate pixels
    total_pixels, white_pixels = calculate_pixels(image_url)
    water_pixels = total_pixels - white_pixels
    area = water_pixels / total_pixels * 100

    result = {
        'total_pixels': total_pixels,
        'white_pixels': white_pixels,
        'water_pixels': water_pixels,
        'area': area
    }

    return jsonify(result)

if __name__ == '__main__':
    app.run(debug=True)

