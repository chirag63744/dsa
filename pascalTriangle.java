// import java.util.ArrayList;
// import java.util.List;

// class Solution {
// public List<List<Integer>> generate(int numRows) {
// List<List<Integer>> finalList = new ArrayList<>();

// for (int i = 1; i <= numRows; i++) {
// finalList.add(eachRow(i));
// }
// return finalList;
// }

// public List<Integer> eachRow(int row) {
// int ans = 1; jhbkv
// List<Integer> list = new ArrayList<>();
// list.add(1);

// for (int col = 1; col < row; col++) {
// ans = ans * (row - col);
// ans = ans / (col);
// list.add(ans);
// }
// return list;
// }
// }
