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
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        
        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);
    
        if (rightMin == 0 && leftMin > 0){
            return leftMin + 1;
        }
        else if (leftMin == 0 && rightMin > 0){
            return rightMin + 1;
        }
        
        return Math.min(leftMin, rightMin) + 1;
        
    }
}
