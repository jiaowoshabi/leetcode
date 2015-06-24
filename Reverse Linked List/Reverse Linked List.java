/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode pre=head;
        ListNode cur=head.next;
        ListNode temp=cur;
    

        while(cur!=null){
            if(pre==head) pre.next=null;
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
        
    }
}