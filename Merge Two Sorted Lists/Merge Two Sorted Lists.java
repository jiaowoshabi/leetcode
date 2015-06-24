public class Solution {
public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l2==null) return l1;
	        if(l1==null ) return l2;
	        ListNode current=null;
	        //create the header of the list
	        ListNode head=l1;
	        if(l1.val>l2.val) head=l2;
	        
	        while(l1!=null || l2!=null){
	            if(l1==null || (l2!=null&&l1.val>l2.val  )){
	            	if(current==null) {
	            		current=l2;
	            		l2=l2.next;
	            		current.next=null;
	            		continue;
	            	}
	            	current.next=l2;
	            	l2=l2.next;
	            	current=current.next;
	            	current.next=null;
	                continue;
	            }
	            if(l2==null || (l1!=null&&l2.val>l1.val  )){
	            	if(current==null) {
	            		current=l1;
	            		l1=l1.next;
	            		current.next=null;
	            		continue;
	            	}
	            	current.next=l1;
	            	l1=l1.next;
	            	current=current.next;
	            	current.next=null;
	                continue;
	            }
	        }
	        return head;       
	    }
}
