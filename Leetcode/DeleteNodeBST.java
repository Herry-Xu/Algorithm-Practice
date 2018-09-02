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
    
    //recursively find min
    private TreeNode findMin(TreeNode root){
        if (root.left == null){
            return root;
        }
        return findMin(root.left);
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        //if value is not found or is the tree is empty
        if (root == null){
            return root;
        }
        //Value is less than key, search right subtree
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        //Value is greater than key, search left subtree
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        //Values match
        else{
            //Case 1: Leaf node
            if (root.left == null && root.right == null){
                root = null;
            }
            //Case 2: One connected node
            else if (root.left == null){
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            //Case 3: Two connected nodes
            else{
                TreeNode temp = findMin(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}
