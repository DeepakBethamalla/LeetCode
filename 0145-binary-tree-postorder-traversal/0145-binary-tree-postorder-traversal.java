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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current!=null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                 if(temp == null){
                      temp = stack.pop();
                      list.add(temp.val);
                     while(!stack.isEmpty() && temp == stack.peek().right){
                         temp = stack.pop();
                         list.add(temp.val);
                     }
                 }else{
                     current = temp;   
                 }
            }
        }
        return list;
    }
}