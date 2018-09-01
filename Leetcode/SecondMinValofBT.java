/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    SortedSet<Integer> checker = new TreeSet<>();
    public SortedSet<Integer> search(TreeNode root){

        if (root == null){
            return checker;
        }
        search(root.left);
        checker.add(root.val);
        search(root.right);
        
        return checker;
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        int minVal;
        if (root == null){
            return -1;
        }
        search(root);
        if (checker.size() < 2){
            return -1;
        }
        return checker.tailSet(checker.first() + 1).first();
    }
}
