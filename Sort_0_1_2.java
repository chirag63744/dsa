// class Solution {
// public static void sort012(int[] nums) {
// int low = 0;
// int mid = 0;
// int n = nums.length;
// int high = n - 1;

// while (mid <= high) {
// if (nums[mid] == 0) {
// int temp = nums[mid];
// nums[mid] = nums[low];
// nums[low] = temp;
// mid = mid + 1;
// low = low + 1;
// } else if (nums[mid] == 1) {
// mid = mid + 1;
// } else if (nums[mid] == 2) {
// int temp = nums[mid];
// nums[mid] = nums[high];
// nums[high] = temp;
// high = high - 1;
// }
// }
// }
// }
