package Day11;
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

// Leetcode 1022. Sum of root to leaf binary numbers
public class Solution1022 {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root , 0);
    }
    private int dfs(TreeNode node , int current){
        if(node == null){
            return 0;
        }
        current = current * 2 + node.val;
        if(node.left == null && node.right == null){
            return current;
        }
        return dfs(node.left,current)+dfs(node.right,current);
    }
}
