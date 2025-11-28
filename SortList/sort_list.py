from typing import Optional 

# TODO: currently fails large test cases due to getLength function as it has to recurse all the way
#       to the end of the list which takes too much time...
#       (may have to re-write to use merge sort instead...)

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    
    def printList(self, head):

        print(head.val, " ", end="") 
        if head.next is not None:
            self.printList(head.next)

    
    def split (self):
        pass


    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        pass


    def merge(self, left, right):
        pass

if __name__ == "__main__":

    #LL = ListNode(6, ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1))))))
    LL = ListNode(1, ListNode(2))
    sol = Solution()

    #sol.sortList(LL)
    sol.printList(sol.sortList(LL))

