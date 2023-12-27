// public class Solution {
// public static int count(int arr[], int n, int x) {
// int low = 0;
// int high = n - 1;
// int mid = 0;
// int[] ans = new int[2];

// while (low <= high) {
// mid = (low + high) / 2;

// if (arr[mid] == x) {
// int temp = mid;

// while (temp >= 0 && arr[temp] == x) {
// ans[0] = temp;
// temp = temp - 1;
// }

// while (mid <= high && arr[mid] == x) {
// ans[1] = mid;
// mid = mid + 1;
// }

// int count = ans[1] - ans[0] + 1;
// return count;
// }

// if (arr[mid] > x) {
// high = mid - 1;
// } else {
// low = mid + 1;
// }
// }

// // Element not found
// return -1;
// }
// }
