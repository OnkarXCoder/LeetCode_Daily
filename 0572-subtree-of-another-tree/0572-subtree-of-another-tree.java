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
    public boolean isidentical(TreeNode root,TreeNode sub){
        if(root==null && sub==null){
            return true;
        }
        else if(root==null || sub==null || root.val!=sub.val){
            return false;
        }
        if(!isidentical(root.left,sub.left)){
            return false;
        }
        if(!isidentical(root.right,sub.right)){
            return false;
        }
        return true;
    }
    public boolean subtree(TreeNode root,TreeNode sub){
        if(root==null){
            return false;
        }
        if(root.val==sub.val){
            if(isidentical(root,sub)){
                return true;
            }
        }
        return subtree(root.left,sub) || subtree(root.right,sub);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return subtree(root,subRoot);
    }
}