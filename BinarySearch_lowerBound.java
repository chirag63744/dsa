// public class Solution {
// public static int lowerBound(int[] arr, int n, int x) {
// // Write your code here
// int low = 0;
// int high = n - 1;
// int mid = 0;
// int ans = n;

// if (arr[0] >= x) {
// return 0;
// }
// if (arr[high] < x) {
// return n;
// }

// while (low <= high) {
// mid = (low + high) / 2;

// if (arr[mid] == x) {
// return mid;
// }
// if (arr[mid] > x) {
// high = mid - 1;
// ans = mid;
// } else {
// low = mid + 1;
// }
// }
// return ans;
// }
// }
