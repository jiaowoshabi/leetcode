Q: Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

A:  multiple cases should be considered here:
1.both lists are empty, return null
2.one of the list is empty, return the other list.
3.the header of the list can e fake, not the exact first node in the list. Just return fakeheader.next when needed.
4.Notice the reference issue(A->C, B->C, if C changes, A & B will also change). 
