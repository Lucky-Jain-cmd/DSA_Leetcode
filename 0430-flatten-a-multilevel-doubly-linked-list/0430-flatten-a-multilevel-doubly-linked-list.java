/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null){
                    st.push(temp.next);
                }
                temp.next=temp.child;
                temp.child.prev=temp;
                temp.child=null;
            }
            if(temp.next==null && !st.isEmpty()){
                Node a = st.pop();
                temp.next=a;
                a.prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}