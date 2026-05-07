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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)return head;
        //dummyNode to handle left = 1
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode previousNode = dummyNode;

        for(int i = 0; i < left - 1;++i){
            previousNode = previousNode.next;
        }

        ListNode currentNode = previousNode.next;
        
        for(int i = 0; i < right - left; ++i){
            ListNode tempNode = currentNode.next;
			currentNode.next = tempNode.next;
			tempNode.next = previousNode.next;
			previousNode.next = tempNode;
        }
              
        
        return dummyNode.next;


    }
}