// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class Solution {
// public List<List<Integer>> threeSum(int[] nums) {
// Arrays.sort(nums);
// int n = nums.length;
// List<List<Integer>> list = new ArrayList<>();

// for (int i = 0; i < n - 2; i++) {
// if (i > 0 && nums[i] == nums[i - 1]) continue;

// int j = i + 1;
// int k = n - 1;

// while (j < k) {
// int sum = nums[i] + nums[j] + nums[k];
// if (sum < 0) {
// j++;
// } else if (sum > 0) {
// k--;
// } else {
// List<Integer> triplet = new ArrayList<>();
// triplet.add(nums[i]);
// triplet.add(nums[j]);
// triplet.add(nums[k]);
// list.add(triplet);

// while (j < k && nums[j] == nums[j + 1]) j++;
// while (j < k && nums[k] == nums[k - 1]) k--;

// j++;
// k--;
// }
// }
// }
// return list;
// }
// }
