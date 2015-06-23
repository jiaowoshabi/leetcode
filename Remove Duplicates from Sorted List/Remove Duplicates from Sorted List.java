public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //if empty or single node list, return head
        if(head==null || head.next==null)
        return head;
        //create two pointers
        ListNode fast_pointer=head.next;
        ListNode slow_pointer=head;
        //check duplicates
        while(slow_pointer.next!=null){
            if(slow_pointer.val==fast_pointer.val){
                slow_pointer.next=fast_pointer.next;
                fast_pointer=fast_pointer.next;
            }else{
                slow_pointer=fast_pointer;
                fast_pointer=slow_pointer.next;
            }
            
        }
        return head;
        
    }
}