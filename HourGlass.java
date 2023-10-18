// class Solution {
// public int maxSum(int[][] grid) {
// int r=grid.length;
// int c=grid[1].length;
// System.out.println(r);

// int sum=0;
// int sum1=0;

// for(int i=0;i<r-2;i++)
// {
// for(int j=0;j<c-2;j++)
// {
// sum1=(grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2]);
// if(sum1>=sum)
// {
// sum=sum1;
// }
// }
// }
// return sum;

// }
// }