// class Solution {
// public int pivotIndex(int[] nums) {
// int rightsum=0;
// int leftsum=0;
// int n=nums.length;
// int index=-1;
// for(int i=0;i<n;i++)
// {
// rightsum=rightsum+nums[i];
// }
// for(int i=0;i<n;i++)
// {
// rightsum=rightsum-nums[i];
// if(leftsum==rightsum)
// {
// index=i;
// break;

// }
// leftsum=leftsum+nums[i];

// }
// return index;

// }
// }