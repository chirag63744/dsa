// /****************************************************************

// Following is the class structure of the Node class:

// class Node {
// public int data;
// public Node next;
// public Node prev;

// Node()
// {
// this.data = 0;
// this.next = null;
// this.prev = null;
// }

// Node(int data)
// {
// this.data = data;
// this.next = null;
// this.prev = null;
// }

// Node(int data, Node next)
// {
// this.data = data;
// this.next = next;
// this.prev = next;
// }
// };

// *****************************************************************/

// public class Solution
// {
// public static Node insertAtFirst(Node list, int newValue) {

// Node newval=new Node(newValue);
// newval.prev=null;
// newval.next=list;
// list.prev=newval;

// return newval;
// // Write your code here
// }
// }