// public class Solution {
// public static int longestSubarrayWithSumK(int []a, long k) {
// // Write your code here
// int n=a.length;
// int len = 0;
// for (int i = 0; i < n; i++) { // starting index
// long s = 0; // Sum variable
// for (int j = i; j < n; j++) { // ending index
// // add the current element to
// // the subarray a[i...j-1]:
// s += a[j];

// if (s == k)
// len = Math.max(len, j - i + 1);
// }
// }
// return len;
// }
// }