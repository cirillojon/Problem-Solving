# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        if head is None:
            return None

        while head.val == val:
            if head.next is not None:
                res = head.next
            else:
                return None
            head = head.next
        else:
            res = head
    
        while head is not None and head.next is not None:
            if(head.next.val == val):
                if head.next.next is not None:
                    head.next = head.next.next
                    continue
                else:
                    head.next = None
                    break
            head = head.next
        
        if head is None or head.val == val:
            return None
        return res