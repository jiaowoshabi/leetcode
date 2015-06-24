/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l2==null) return l1;
	        if(l1==null ) return l2;
	        ListNode current=new ListNode(-1);//create a fake header of the list
	        ListNode head=current;
	        while(l1!=null && l2!=null){
	            if(l1.val>l2.val ){
	                current.next=l2;
	                l2=l2.next;
	                current=current.next;
	            }
	            else{
	                current.next=l1;
	                l1=l1.next;
	                current=current.next;
	            }
	        }
	        if(l1!=null) current.next=l1;//append l1 if l2 run out of nodes
	         if(l2!=null) current.next=l2;//append l2 if l1 run out of nodes
	        return head.next;
	    }
}
