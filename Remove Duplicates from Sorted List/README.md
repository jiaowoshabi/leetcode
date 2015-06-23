Q:Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,

Given 1->1->2, return 1->2.

Given 1->1->2->3->3, return 1->2->3.

Algorithm:
Keep two pointers: fast_pointer and slow_pointer and make sure that the distance between them is "one node", eg. fast_pointer=slow_pointer.next
And then delete the dupilcates

Notice that the list may contain 0 or 1 node;
