// public class Solution {
// public static Node reverseDLL(Node head) {
// Node current = head;
// Node temp=head;

// while (current != null) {
// // Swap the prev and next pointers of the current node
// temp = current.prev;
// current.prev = current.next;
// current.next = temp;

// // Move to the next node in the original list
// current = current.prev;
// }

// // Check if the list is not empty
// if (temp != null) {
// // Update the head to the last node, which is now the first node in the
// reversed list
// head = temp.prev;
// }

// return head;
// }
// }
