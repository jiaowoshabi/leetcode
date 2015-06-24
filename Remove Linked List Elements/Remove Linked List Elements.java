/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode current=head;
        ListNode pre=head;
        //check the first node of the list is "val"
        while(head.val==val){
            if(head.next!=null)
            head=head.next;
            else
            return null;
        }
        
        while(current!=null){
            if(current.val==val) {
                pre.next=current.next;
                current=current.next;
                continue;
            }else{
                pre=current;
                current=current.next;
            }
        }
        return head;
    }
}
    
