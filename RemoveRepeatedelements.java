// import java.util.ArrayList;

// public class Solution {
// public static int removeDuplicates(ArrayList<Integer> arr, int n) {
// if (n <= 1) {
// return n;
// }

// int uniquePtr = 0;

// for (int i = 1; i < n; i++) {
// if (!arr.get(i).equals(arr.get(uniquePtr))) {
// uniquePtr++;
// arr.set(uniquePtr, arr.get(i));
// }
// }

// return uniquePtr + 1;
// }
// }