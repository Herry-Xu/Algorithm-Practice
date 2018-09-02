/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        //base cases
        if (root == null){
            return;
        }
        
        //only connect the right child node of current subtree to the left child node of the next subtree if it exists
        if (root.left != null){
            root.left.next = root.right;
            if (root.next != null){
                root.right.next = root.next.left;
            }
        }

        //recursive steps
        connect(root.left);
        connect(root.right);
    }
}
