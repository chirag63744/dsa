// public class Solution {
// public static int searchInsert(int [] arr, int m){
// // Write your code here.
// int n =arr.length;
// int high=n-1;
// int low =0;
// int mid=0;
// if(n==0)
// {
// return 0;
// }
// if(m>arr[high])
// {
// return high+1;
// }
// if(m<arr[0])
// {
// return 0;
// }
// while(low<=high)
// {
// mid=(low+high)/2;
// if(arr[mid]==m )
// {
// return mid;
// }
// if(arr[mid]<m)
// {
// low=mid+1;

// }
// else{
// high=mid-1;

// }
// }
// if(arr[mid]>m)
// {
// return mid;
// }
// else{

// return mid+1;
// }
// }
// }