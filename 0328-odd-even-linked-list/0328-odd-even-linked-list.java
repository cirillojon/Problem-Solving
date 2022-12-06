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
        ListNode root = head; int index = 1;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        while(root != null){
            if( index % 2 == 0) even.add(root.val);
            else odd.add(root.val);
            index++; root = root.next;
        }
        root = head;
        for(int j = 0; j < (index-1); j++){
            if(j < odd.size()) root.val = odd.get(j);
            else root.val = even.get(j-odd.size());
            root = root.next;
        }
        return head;
    }
}