// import java.util.*;

// public class Solution {
// public static int[] getFloorAndCeil(int[] arr, int n, int x) {
// int low = 0;
// int high = n - 1;
// int mid = 0;
// int[] ans = new int[2];

// if (x >= arr[high]) {
// ans[0] = arr[high];
// ans[1] = -1;
// }

// if (x < arr[0]) {
// ans[0] = -1;
// ans[1] = arr[0];
// }

// while (low <= high) {
// mid = (high + low) / 2;

// if (arr[mid] == x) {
// ans[0] = arr[mid];
// ans[1] = arr[mid];
// return ans;
// } else if (arr[mid] > x) {
// ans[1] = arr[mid];
// high = mid - 1;
// } else {
// ans[0] = arr[mid];
// low = mid + 1;
// }
// }

// return ans;
// }

// }
