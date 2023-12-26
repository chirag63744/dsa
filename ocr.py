from google.cloud import vision_v1
from google.cloud.vision_v1 import types

def extract_text_from_pdf(pdf_path):
    client = vision_v1.ImageAnnotatorClient()

    with open(pdf_path, 'rb') as image_file:
        content = image_file.read()

    image = types.Image(content=content)
    response = client.document_text_detection(image=image)

    texts = [page.text for page in response.full_text_annotation.pages]
    return texts

pdf_path = 'D:\DSA_Leetcode\Fat Java\Resume_Chirag.pdf'
extracted_text = extract_text_from_pdf(pdf_path)

for text in extracted_text:
    print(text)
