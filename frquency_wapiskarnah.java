// import java.util.HashMap;
// import java.util.Map;
// public class Solution {

// public static int[] getFrequencies(int []v) {
// Map<Integer, Integer> frequencyMap = new HashMap<>();
// Map<Integer, Integer> smallestMap = new HashMap();

// for (int num : v) {
// frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
// smallestMap.putIfAbsent(num, num);
// }

// int maxFrequency = Integer.MIN_VALUE;
// int minFrequency = Integer.MAX_VALUE;
// int highestFrequencyElement = Integer.MAX_VALUE;
// int lowestFrequencyElement = Integer.MAX_VALUE;

// for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
// int element = entry.getKey();
// int frequency = entry.getValue();

// if (frequency > maxFrequency || (frequency == maxFrequency && element <
// highestFrequencyElement)) {
// maxFrequency = frequency;
// highestFrequencyElement = element;
// }

// if (frequency < minFrequency || (frequency == minFrequency && element <
// lowestFrequencyElement)) {
// minFrequency = frequency;
// lowestFrequencyElement = element;
// }
// }

// return new int[]{highestFrequencyElement, lowestFrequencyElement};

// }
// }