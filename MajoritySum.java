// class Solution {
// public List<Integer> majorityElement(int[] nums) {
// int count =0;
// int count2=0;
// int el=Integer.MIN_VALUE;
// int el2=Integer.MIN_VALUE;
// int n=nums.length;
// List<Integer> list= new ArrayList<>();
// for(int i =0;i<n;i++)
// {
// if(count==0 && nums[i]!=el2 )
// {
// count=1;
// el=nums[i];
// }
// else if(count2==0 && nums[i]!=el)
// {
// count2=1;
// el2=nums[i];
// }
// else if(nums[i]==el)
// {
// count++;
// }
// else if (nums[i]==el2)
// {
// count2++;
// }
// else{
// count--;
// count2--;
// }
// }
// System.out.println(count+" "+el);
// System.out.println(count2+" "+el2);
// count=0;
// count2=0;
// for(int i=0;i<n;i++)
// {
// if(nums[i]==el)
// {
// count++;
// }
// if(nums[i]==el2)
// {
// count2++;
// }
// }

// if(count>n/3)
// {
// list.add(el);
// }
// if(count2>n/3)
// {
// list.add(el2);
// }

// Collections.sort(list);
// return list;

// }
// }