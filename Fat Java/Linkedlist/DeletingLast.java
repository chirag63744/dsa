// import javax.lang.model.type.NullType;

// /****************************************************************

// Following is the class structure of the Node class:

// class Node {
// public int data;
// public Node next;

// Node()
// {
// this.data = 0;
// this.next = null;
// }

// Node(int data)
// {
// this.data = data;
// this.next = null;
// }

// Node(int data, Node next)
// {
// this.data = data;
// this.next = next;
// }
// };

// *****************************************************************/

// public class Solution {
// public static Node deleteLast(Node list) {
// if (list == null || list.next == null) {
// // If the list is empty or has only one node, set list to null
// return null;
// }

// Node temp = list;
// Node prev = null;

// while (temp.next != null) {
// prev = temp;
// temp = temp.next;
// }

// prev.next = null; // Set the next of the second-to-last node to null
// return list;
// }
// }
