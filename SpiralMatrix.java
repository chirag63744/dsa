// import java.util.*;
// public class Solution {
// public static int[] spiralMatrix(int [][]MATRIX) {
// // Write your code here.

// int n= MATRIX.length;
// int m =MATRIX[0].length;
// int []mat=new int[n*m];
// int top=0;
// int left=0;
// int right=m-1;
// int bottom=n-1;
// int mati=0;

// while(left<=right && top <=bottom)
// {

// for(int i =left;i<=right;i++)
// {
// mat[mati]=MATRIX[top][i];
// mati=mati+1;

// }
// top=top+1;
// for(int i =top;i<=bottom;i++)
// {
// mat[mati]=MATRIX[i][right];
// mati=mati+1;
// }
// right=right-1;
// if (top <= bottom) {
// for(int i=right;i>=left;i--)
// {
// mat[mati]=MATRIX[bottom][i];
// mati=mati+1;
// }
// }
// bottom=bottom-1;
// if (left <= right) {
// for(int i= bottom;i>=top;i--)
// {
// mat[mati]=MATRIX[i][left];
// mati=mati+1;
// }
// left=left+1;
// }
// }
// return mat;
// }
// }
