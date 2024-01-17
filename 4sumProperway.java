// import java.util.Arrays;

// public class Solution {
// public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){

// int n=a.length;
// int m= b.length;

// if(n>=m)
// {
// Arrays.sort(a);
// int j=n-1;
// for(int i=0;i<m;i++)
// {
// if(a[j]>b[i])
// {
// long temp=a[j];
// a[j]=b[i];
// b[i]=temp;
// j--;
// }

// }
// }
// else{
// Arrays.sort(b);
// int i=0;
// for(int j=n-1;j>=0;j--)

// {
// if(a[j]>b[i])
// {
// long temp=a[j];
// a[j]=b[i];
// b[i]=temp;
// i++;

// }

// }
// }
// Arrays.sort(a);
// Arrays.sort(b);

// }
// }