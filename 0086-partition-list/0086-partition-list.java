class Solution {
    public ListNode partition(ListNode head, int x) {      
        if(head == null) return null;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> first_half = new ArrayList<Integer>();
        List<Integer> second_half = new ArrayList<Integer>();
        while(head != null){list.add(head.val); head = head.next;}
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < x) first_half.add(list.get(i));
            if(list.get(i) >= x) second_half.add(list.get(i));
        } first_half.addAll(second_half);
        ListNode root = new ListNode(); ListNode res = root;
        root.val = first_half.get(0);
        for(int i = 1; i < first_half.size(); i++){
            ListNode temp = new ListNode();
            temp.val = first_half.get(i);
            root.next = temp; root = root.next;
        } return res;
    }
}