// public class Solution {
// public static int search(int []nums, int target) {
// // Write your code here.
// int n=nums.length;
// int low=0;
// int end=n-1;
// int mid=(end+low)/2;
// while(low<=end)
// {
// if(nums[mid]==target)
// {
// return mid;
// }
// else if(nums[mid]>target)
// {
// end=mid-1;
// mid=(end+low)/2;
// }
// else
// {
// low =mid+1;
// mid=(end+low)/2;
// }
// }
// return -1;

// }
// }