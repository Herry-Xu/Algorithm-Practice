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
    //First created outerList for each level
    //Size of each level is defined by the amount of elements in the queue at the beginning of a loop
    //Used a queue to keep track of discovered TreeNodes at every level
    //Visit a node, store its value, add its children from left to right to queue, remove node from queue
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return outerList;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i=0; i < size; i++){
                TreeNode current = queue.peek();
                innerList.add(current.val);

                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null){
                    queue.add(current.right);
                }
                queue.remove();
            }
            outerList.add(innerList);
        }
        return outerList;
    }
}
