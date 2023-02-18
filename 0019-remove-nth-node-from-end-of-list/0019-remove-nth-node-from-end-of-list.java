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
public ListNode removeNthFromEnd(ListNode head, int n) {
        // If the list has only one node and n = 1, return an empty list
        if(n==1 && head.next == null) return null;
        
        // If the list has only two nodes and n = 2, return the second node
        if(n==2 && head.next.next == null) return head.next;
        
        ListNode root = head;
        int len = 0;
        int remove;
        
        // Traverse the linked list and count the number of nodes
        while(head != null){
            head = head.next;
            len++;
        }
        // Calculate the index of the node to remove
        remove = len - n;
        head = root;
        // Traverse the linked list to find the node before the one to remove
        for(int i = 0; i < remove-1; i++) head = head.next;

        // If the node to remove is the first node
        if(n == len) return head.next;
        // If the node to remove is the last node
        if(head.next.next == null){
            head.next = null;
            return root;
        }

        // Remove the node by linking the previous node to the next node
        head.next = head.next.next;
        // Return the original head
        return root;
    }
}