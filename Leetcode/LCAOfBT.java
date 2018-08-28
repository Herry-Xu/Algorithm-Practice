/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //recursive solution that searches left and right subtrees for matching values. Takes O(n) always.
 //If p & q both exist in a subtree, return the root.
 //If only one of p & q exist, return the Node itself
 //If neither p or q exists in the subtree, return null (or the right TreeNode which is going to be null)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        else if (left != null){
            return left;
        }
        return right;
    }
}
