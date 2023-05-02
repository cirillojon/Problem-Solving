class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode root = head; ListNode res = head;
        if(res == null || res.next == null) return res;
        while (res.next != null) {
            int temp = res.val;
            res.val = res.next.val;
            res.next.val = temp;
            if (res.next.next == null) break;
            res = res.next.next;
        } return head;
    }        
}