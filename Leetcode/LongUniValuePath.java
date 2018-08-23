/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int len = 0;
    public int longestUnivaluePath(TreeNode root){
        if (root == null)
            return 0;
        len = 0;
        getLen(root, root.val);
        return len;
    }
    
    public int getLen(TreeNode root, int value) {
        if (root == null){
            return 0;
        }
        int left = getLen(root.left, root.val);
        int right = getLen(root.right, root.val);
        len = Math.max(len, right + left);
        if (root.val == value) return Math.max(left,right) + 1;
        return 0;
        
    }
}
