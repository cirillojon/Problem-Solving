class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int count = 1;
        int swap_val = head.val;
        ListNode res = head;
        ListNode temp = head;
        ListNode swap_ref = head;
        while(head.next != null){     
            if(count < k){ 
                head = head.next;
                count++;
                continue;
            }
            if(count == k) {
                swap_val = head.val;
                swap_ref = head;
            }
            temp = temp.next;
            head = head.next;
            count++;
        }
        int extra = count++;
        if(extra == k){ 
            swap_val = head.val; 
            head.val = res.val;
            res.val = swap_val;
            return res;
            }
        swap_ref.val = temp.val;
        temp.val = swap_val;
        return res;
    }
}