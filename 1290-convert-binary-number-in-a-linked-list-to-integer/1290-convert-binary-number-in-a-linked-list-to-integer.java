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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        String s = new String();
        s=sb.toString();
        int sum=0;
        int power=0;
        for(int i=s.length()-1;i>=0;i--){
            int bit = s.charAt(i)-'0';
            sum += bit*Math.pow(2,power);
            power++;
        }
        return sum;
    }
}