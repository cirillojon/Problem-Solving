class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        cache = set()

        while(head is not None):
            if head in cache:
                return True
            
            cache.add(head)
            head = head.next


        return False