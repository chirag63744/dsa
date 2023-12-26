// import java.util.ArrayList;

// public class Solution {

// public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int
// k) {
// // Write your code here.
// int[] ans = new int[2];
// ans[0] = -1;
// ans[1] = -1;
// int low = 0;
// int high = n - 1;
// int mid = 0;

// while (low <= high) {
// mid = (low + high) / 2;
// if (arr.get(mid) == k) {
// while (true) {
// if (mid > 0 && arr.get(mid) == k && arr.get(mid - 1) == k) {
// ans[0] = mid - 1;
// mid = mid - 1;
// } else {
// ans[0] = mid;
// break;
// }
// }
// while (true) {
// if (mid <= high && arr.get(mid) == k) {
// ans[1] = mid;
// mid = mid + 1;
// } else {
// break;
// }
// }
// return ans;
// }
// if (arr.get(mid) > k) {
// high = mid - 1;
// }
// if (arr.get(mid) < k) {
// low = mid + 1;
// }
// }
// return ans; // This line is added to handle the case when the element is not
// found.
// }
// }