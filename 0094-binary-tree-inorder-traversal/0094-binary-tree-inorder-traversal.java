/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder_helper(root,al);
        return al;}
        void  inorder_helper(TreeNode root,ArrayList<Integer> al){
        if(root==null) return;
        inorder_helper(root.left,al);
        al.add(root.val);
      inorder_helper(root.right,al);
    }
}