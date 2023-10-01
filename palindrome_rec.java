// public class Solution {
// public static boolean isPalindrome(String str) {
// // Write your code here.
// int i=0;
// int count=0;
// return Rec(str, i, count);

// }

// static boolean Rec(String str, int i, int count) {
// int len = str.length();

// if (i <= len / 2) {
// if (str.charAt(i) == str.charAt(len - 1 - i)) {
// // Recursively check the next character pair
// return Rec(str, i + 1, count);
// } else {
// // If characters don't match, it's not a palindrome
// return false;
// }
// }

// // If we reach this point, it means we've checked all character pairs
// return true;
// }

// }
