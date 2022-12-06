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
    public ListNode oddEvenList(ListNode head) {
        ListNode node = head; ListNode root = head;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        int index = 1;
        while(root != null){
            if( index % 2 == 0) even.add(root.val);
            else odd.add(root.val);
            index++; root = root.next;
        }

        for(int j = 0; j < (index-1); j++){
            if(j < odd.size()) node.val = odd.get(j);
            else node.val = even.get(j-odd.size());
            node = node.next;
        }
        return head;
    }
}