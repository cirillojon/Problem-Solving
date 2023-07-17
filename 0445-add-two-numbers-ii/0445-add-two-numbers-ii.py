# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        res = ListNode()
        temp = res
        
        list1 = []
        list2 = []
        
        while l1 != None:
            list1.append(l1.val)
            l1 = l1.next
            
        while l2 != None:
            list2.append(l2.val)
            l2 = l2.next
            
        val1 = ""
        for i in list1:
            val1 += str(i)
            
        val2 = ""
        for i in list2:
            val2 += str(i)
            
        st = str(int(val1) + int(val2))

        for i in range(len(st)):
            temp.val = int(st[i])
            if(i < len(st) - 1):
                temp.next = ListNode()
                temp = temp.next
        
        return res