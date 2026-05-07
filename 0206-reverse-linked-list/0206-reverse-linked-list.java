/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // if(head == null) {
		// 	System.out.println("linked list empty");
		// 	return;
		// }
		ListNode previous = null;
		ListNode current = head;
		while(current != null ) {
			ListNode dummyNode = current.next;
			current.next = previous;
			previous = current;
			current = dummyNode;
		}
        
        return previous;
    }
}