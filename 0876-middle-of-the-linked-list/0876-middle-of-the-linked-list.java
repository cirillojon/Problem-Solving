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
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int middle = (list.size()/2); int i = middle + 1; 
        ListNode res = new ListNode();
        ListNode node = res;

        res.val = (list.get(middle));
        while(i < list.size()){
            ListNode temp = new ListNode();
            res.next = temp;
            res = res.next;
            res.val = list.get(i);
            i++;
        }
        return node;
    }
} 