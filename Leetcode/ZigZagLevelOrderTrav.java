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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        if (root == null){
            return outerList;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            int zigzag = outerList.size();

            for (int i = 0; i < size; i++){
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
            if (zigzag % 2 == 1){
                Collections.reverse(innerList);
                outerList.add(innerList);
            }
            else{
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
