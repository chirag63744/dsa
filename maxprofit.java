// public class Solution {
// public static int bestTimeToBuyAndSellStock(int[] prices) {
// int n = prices.length;
// if (n == 0) {
// return 0; // No profit can be made with an empty array.
// }

// int minPrice = prices[0];
// int maxProfit = 0;

// for (int i = 1; i < n; i++) {
// if (prices[i] < minPrice) {
// minPrice = prices[i];
// } else if (prices[i] - minPrice > maxProfit) {
// maxProfit = prices[i] - minPrice;
// }
// }

// return maxProfit;
// }
// }
