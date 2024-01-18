
// // class Node {
// // public int data;
// // public Node next;

// // Node()
// // {
// // this.data = 0;
// // this.next = null;
// // }

// // Node(int data)
// // {
// // this.data = data;
// // this.next = null;
// // }

// // Node(int data, Node next)
// // {
// // this.data = data;
// // this.next = next;
// // }
// // };

// public class Solution {
// public static Node constructLL(int []arr) {
// // Write your code here
// int n=arr.length;

// Node temp=new Node(arr[0]);
// Node mover=temp;
// for(int i =1;i<n;i++)
// {
// Node temp2=new Node(arr[i]);
// mover.next=temp2;
// mover=temp2;
// }

// return temp;

// }
// }