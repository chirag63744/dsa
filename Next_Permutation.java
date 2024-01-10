// import java.util.Arrays;

// class Solution {
// public void nextPermutation(int[] nums) {
// int n = nums.length;
// int index = -1;

// for (int i = n - 2; i >= 0; i--) {
// if (nums[i] < nums[i + 1]) {
// index = i;
// break;
// }
// }

// if (index != -1) {
// for (int i = n - 1; i > index; i--) {
// if (nums[i] > nums[index]) {
// // Swap elements
// int temp = nums[index];
// nums[index] = nums[i];
// nums[i] = temp;
// break;
// }
// }

// Arrays.sort(nums, index + 1, n);
// } else {

// Arrays.sort(nums);
// }
// }
// }
