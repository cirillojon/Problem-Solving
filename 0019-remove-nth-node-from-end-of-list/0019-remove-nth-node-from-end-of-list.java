class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode res  = head; int i = 0;
        ListNode current = head; ListNode behind = head;
        while(current.next != null){       
            if(i >= n) behind = behind.next;
            current = current.next; i++;
        } if(!(i == n - 1)) behind.next = behind.next.next;
          else return head.next; return head;
    }
}