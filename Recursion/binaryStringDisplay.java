
// import java.util.ArrayList;
// import java.util.List;

// public class Solution {
// public static void gent(int i, int N, String s, List<String> list) {
// if (i >= N) {
// list.add(s);
// return;
// }
// s = s + '0';
// gent(i + 1, N, s, list);
// s = s.substring(0, s.length() - 1);
// if (!s.isEmpty()&&s.charAt(s.length() - 1) == '0') {
// s = s + '1';
// gent(i + 1, N, s, list);
// }
// else if(s.isEmpty())
// {
// s = s + '1';
// gent(i + 1, N, s, list);
// }
// }

// public static List<String> generateString(int N) {
// List<String> list = new ArrayList<>();
// gent(0, N, "", list);
// return list;
// }}