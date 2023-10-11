// public class Solution {
// public static int[] getSecondOrderElements(int n, int []arr) {
// // Write your code here.
// int temp=0;
// int index=0;
// //Your code goes here
// for(int i=0;i<n;i++)
// {
// int min =arr[i];
// for(int j=i+1;j<n;j++)
// {

// if(arr[j]<min)
// {
// min =arr[j];
// index=j;

// }

// }
// if(index!=0){
// temp=arr[i];
// arr[i]=arr[index];
// arr[index]=temp;

// index=0;
// }

// }
// int []a=new int[2];
// a[0]=arr[n-2];
// a[1]=arr[1];
// return a;
// }
// }