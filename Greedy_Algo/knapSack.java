// import java.util.* ;
// import java.io.*;
// /****************************************************************

// Following is the class structure of the Pair class:

// class Pair
// {
// int weight;
// int value;
// Pair(int weight, int value)
// {
// this.weight = weight;
// this.value = value;
// }

// }

// *****************************************************************/

// public class Solution {
// public static double maximumValue(Pair[] items, int n, int w) {
// // Write your code here.
// // ITEMS contains {weight, value} pairs.
// Arrays.sort(items,new Comparator<Pair>(){
// public int compare(Pair a, Pair b)
// {
// double ar= (double) a.value/a.weight;
// double br= (double) b.value/b.weight;
// if(ar>br)
// {
// return -1;
// }
// else if(ar<br)
// {
// return 1;
// }
// else{
// return 0;
// }

// }
// });
// double sumw=0.0;
// double val=0.0;
// // for(int i =0;i<n;i++)
// // {
// // System.out.println(items[i].weight+" "+items[i].value);
// // }

// for(int i =0;i<n;i++)
// {
// if(sumw+items[i].weight<=w)
// {
// val=val+items[i].value;
// sumw=sumw+items[i].weight;
// //System.out.println("d:"+sumw);
// }
// else if(sumw+items[i].weight>w)
// {
// //System.out.println("dww:"+items[i].weight);
// double temp=(sumw+items[i].weight)-w;
// temp=items[i].weight-temp;
// //System.out.println("dw:"+temp);

// double tempp=(temp/items[i].weight)*items[i].value;
// val=val+tempp;
// break;
// }
// }

// return val;
// }
// }
