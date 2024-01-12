// class Solution {
// public static void rotateMatrix(int[][] matrix) {
// int n=matrix.length;
// int m=matrix[0].length;
// int [][]mat=new int[n][m];
// int l=0;

// for(int j=0;j<m;j++)
// {
// int k=0;
// for(int i=n-1;i>=0;i--)
// {

// mat[l][k]=matrix[i][j];
// k=k+1;
// }
// l=l+1;
// }
// for(int i=0;i<n;i++)
// {
// for(int j=0;j<m;j++)
// {
// matrix[i][j]=mat[i][j];
// }
// }

// }
// }