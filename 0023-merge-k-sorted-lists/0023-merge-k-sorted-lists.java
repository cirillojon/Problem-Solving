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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < lists.length; i++)
        {
            while(lists[i] != null)
            {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
                
        }
        
    if(list.size() == 0)
        return null;
        
        
        
          Collections.sort(list);

          System.out.println(list);
    
        ListNode root = new ListNode();
        ListNode head = root;
        
        
        for(int i = 0; i < list.size(); i++)
        {
            root.val = list.get(i);
            if(i < list.size()-1)
            {
            root.next = new ListNode();
            root = root.next;
            }
             
        }
        
        return head; 
    }
}