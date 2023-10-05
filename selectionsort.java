// public class Solution {
// public static int[] selectionSort(int[] arr) {
// int temp=0;
// int index=0;
// //Your code goes here
// int n=arr.length;
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
// return arr;
// }
// }