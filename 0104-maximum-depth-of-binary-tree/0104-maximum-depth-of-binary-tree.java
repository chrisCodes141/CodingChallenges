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
    
        int depth = 0; 
        int descDepth = 0;
      
    public int maxDepth(TreeNode root) {
       
        
        if(root == null) return 0;
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            
            if(lDepth > rDepth) return lDepth+1;
            else return rDepth+1;
        }
    }
}