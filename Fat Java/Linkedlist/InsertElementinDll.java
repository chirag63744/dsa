// public class Solution {
// public static Node insertAtTail(Node list, int K) {
// // Check if the list is empty
// if (list == null) {
// // Create a new node and assign it to the list
// list = new Node(K);
// } else {
// // Traverse the list to find the last node
// Node temp = list;
// while (temp.next != null) {
// temp = temp.next;
// }

// // Create a new node and insert it at the end
// Node newNode = new Node(K);
// temp.next = newNode;
// newNode.prev = temp;
// }

// return list;
// }
// }
