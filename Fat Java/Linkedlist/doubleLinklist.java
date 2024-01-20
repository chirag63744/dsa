// /****************************************************************
// *
// * Following is the class structure of the Node class:
// *
// * class Node {
// * public int data;
// * public Node next;
// * public Node prev;
// *
// * Node()
// * {
// * this.data = 0;
// * this.next = null;
// * this.prev = null;
// * }
// *
// * Node(int data)
// * {
// * this.data = data;
// * this.next = null;
// * this.prev = null;
// * }
// *
// * Node(int data, Node next, Node prev)
// * {
// * this.data = data;
// * this.next = next;
// * this.prev = prev;
// * }
// * };
// *
// *****************************************************************/

// public class Solution {
// public static Node constructDLL(int[] arr) {
// // Write your code here
// Node head = new Node(arr[0]);
// head.prev = null;
// int n = arr.length;
// Node temp = head;
// for (int i = 1; i < n; i++) {
// Node el = new Node(arr[i]);
// temp.next = el;
// el.prev = temp;
// temp = el;
// }
// return head;
// }
// }