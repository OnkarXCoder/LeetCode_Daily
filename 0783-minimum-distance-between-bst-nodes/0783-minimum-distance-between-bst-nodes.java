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
    int min=Integer.MAX_VALUE;
    Integer prev=null;
    private void Getter(TreeNode root){
        if(root==null) return;
        Getter(root.left);
        if(prev!=null){
            min=Math.min(min,Math.abs(prev-root.val));
        }

        prev=root.val;
        Getter(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        Getter(root);
        return min;
    }
}