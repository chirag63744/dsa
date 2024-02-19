// import java.util.ArrayList;

// public class Solution {
// public static void fun(int N, String s, int open, int close,
// ArrayList<String> list) {
// if (s.length() == 2 * N) {
// list.add(s);
// return;
// }
// if (open <N) {
// s = s + '(';
// fun(N, s, open + 1, close, list);
// s = s.substring(0, s.length() - 1);
// }
// if (close < open) {
// s = s + ')';
// fun(N, s, open, close + 1, list);
// }
// }

// public static ArrayList<String> validParenthesis(int n) {
// ArrayList<String> list = new ArrayList<>();
// fun(n, "(", 1, 0, list);
// return list;
// }}