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
    public ListNode sortList(ListNode head) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ListNode res = head; ListNode ret = head;
    while(res != null){
        list.add(res.val);
        res = res.next;
    }
    Collections.sort(list); 
    for(int i = 0; i < list.size(); i++){
        head.val = list.get(i); head = head.next;
    }
    return ret;
    }
}