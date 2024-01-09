// class Solution {
// public int maxProfit(int[] prices) {
// int min=prices[0];
// int min_j=0;
// for(int i =0;i<prices.length;i++){
// if(prices[i]<min)
// {
// min=prices[i];
// }
// if(prices[i]>min)
// {
// if(prices[i]-min>min_j)
// {
// min_j=prices[i]-min;
// }
// }
// }
// return min_j;

// }
// }