/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode temp = headA;
        while(temp!=null){
          
            hs.add(temp);
            temp = temp.next;
        }
        ListNode tem = headB;
        while(tem!=null){
            if(hs.contains(tem)) return tem;
            tem=tem.next;
        }
        return null;

    }
}