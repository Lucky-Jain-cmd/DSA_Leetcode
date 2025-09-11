/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode temp = head;
        int m=0;
     
        while(temp!=null){
            temp=temp.next;
            m++;
        }
        if(n==m){
            return head.next;
        }
        ListNode t = head;
        for(int i=1;i<m-n;i++){
            t=t.next;
        }
            t.next = t.next.next;
            return head;
    }
}