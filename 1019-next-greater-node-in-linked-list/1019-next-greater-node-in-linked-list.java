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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> fill = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            fill.add(temp.val);
            temp=temp.next;
        }
        int n=fill.size();
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0]=0;
        st.push(fill.get(n-1));
        int j=1;
        for(int i=fill.size()-1;i>=0;i--){
             while (!st.isEmpty() && st.peek() <= fill.get(i)) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(fill.get(i));
        }
        
        return ans;
    }
}