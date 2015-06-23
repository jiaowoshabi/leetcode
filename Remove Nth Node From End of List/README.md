Q:

Given a linked list, remove the nth node from the end of list and return its head.
For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
   
Note:
Given n will always be valid.
Try to do this in one pass.

Algorithm:
We can use double pointers(fast_pointer & slow_pointer). Let the fast_pointer go n steps ahead of slow_pointer at the beginning and then move both two pointers to the end. When fast_pointer = null(the very end of the list), the slow_pointer pointds to the node that need to be deleted.

3 cases need to be considered in the code:

1. empty list.

2. delete the first node in the list.

3. delete other node in the list.