// import java.util.ArrayList;

// class Solution {
// public void setZeroes(int[][] matrix) {
// int row = matrix.length;
// int column = matrix[0].length;
// ArrayList<Integer> rowInd = new ArrayList<Integer>();
// ArrayList<Integer> colInd = new ArrayList<Integer>();

// // Find the rows and columns with zeros
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// if (matrix[i][j] == 0) {
// rowInd.add(i);
// colInd.add(j);
// }
// }
// }

// // Set rows to zero
// for (int i = 0; i < rowInd.size(); i++) {
// int n = rowInd.get(i);
// for (int j = 0; j < column; j++) {
// matrix[n][j] = 0;
// }
// }

// // Set columns to zero
// for (int i = 0; i < colInd.size(); i++) {
// int m = colInd.get(i);
// for (int j = 0; j < row; j++) {
// matrix[j][m] = 0;
// }
// }
// }
// }
