
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        List<Integer> list = new ArrayList<Integer>();
        while(list1 != null || list2 != null){
            if(list1 != null ) { list.add(list1.val); list1 = list1.next; }
            if(list2 != null ) { list.add(list2.val); list2 = list2.next; }
        }Collections.sort(list);
        ListNode head = new ListNode(); head.val = list.get(0);
        ListNode node = head;
        for(int i = 1; i < list.size(); i++){
            ListNode temp = new ListNode(); 
            temp.val = list.get(i);
            node.next = temp;
            node = node.next;
        }
        return head;   
    }
}