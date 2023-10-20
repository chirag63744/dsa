// public class Solution {
// public static int getSingleElement(int[] arr) {
// int n = arr.length;
// int count = 0;

// for (int i = 0; i < n; i++) {
// count ^= arr[i];
// // The XOR (^) operation between two equal numbers cancels them out (e.g., 1
// ^ 1 = 0 and 3 ^ 3 = 0).
// // The XOR operation between any number and 0 is the number itself (e.g., x ^
// 0 = x).
// // So, the algorithm effectively cancels out all the pairs, leaving the
// single element in the count variable, which is 2 in this case.
// }

// return count;
// }
// }
