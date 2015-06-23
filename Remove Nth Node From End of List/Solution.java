/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;
        //create two pointers
        ListNode fast_pointer = head;
        ListNode slow_pointer = head;
        
        //let the fast_pointer go n steps further first
        for(int i=0; i<n; i++)
        fast_pointer=fast_pointer.next;
        
        //if the fast_pointer already points to the end of the list, then delete the head of the linkedlist
        if(fast_pointer==null){
            head=head.next;
            return head;
        }
        //if not, move both pointers to the end until the fast_pointer reaches the end.
        while(fast_pointer.next!=null){
            fast_pointer=fast_pointer.next;
            slow_pointer=slow_pointer.next;
        }
        
        //delete the node that slow_pointer.next pionts
        slow_pointer.next=slow_pointer.next.next;
        //return the list(the first reference to the lsit)
        return head;
        
    }
}
