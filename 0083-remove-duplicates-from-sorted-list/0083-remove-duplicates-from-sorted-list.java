class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        Set<Integer> set = new HashSet<>(); 
        ListNode res = head; set.add(head.val);
        while(head.next != null){
            while(head.next.next != null && !set.add(head.next.val))
                head.next = head.next.next;
         if(!set.add(head.next.val) && head.next.next == null){
             head.next = null; return res;
         } head = head.next;
        } return res;
    }
}