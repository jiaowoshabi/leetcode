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
                //if find duplicates, delete any of them. And update the tow pointers to make sure 
            	//that fast_pointer goes one step further than slow_pointer
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
