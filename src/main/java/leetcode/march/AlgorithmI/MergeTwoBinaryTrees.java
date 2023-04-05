package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        new Solution().mergeTrees(null, null);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            TreeNode root = new TreeNode();
            recursion(root1, root2, root);
            if(root.val == 0 && root.right == null && root.left == null){
                return null;
            }
            return root;
        }
        public void recursion(TreeNode root1, TreeNode root2, TreeNode root) {
            if((root1) == null && root2 == null){
                return;
            } else if (root1 == null || root2 == null) {
                root1 = root1 != null ? root1 : new TreeNode();
                root2 = root2 != null ? root2 : new TreeNode();
            }
            if((Integer.valueOf(root1.val)) != null && (Integer.valueOf(root2.val)) != null){
                root.val = root1.val + root2.val;
            }
            else{
                root.val = Integer.valueOf(root1.val) != null ? root1.val : root2.val;
            }
            if(root1.left != null || root2.left != null){
                root.left = new TreeNode();
                recursion(root1.left != null ? root1.left : new TreeNode(), root2.left != null ? root2.left : new TreeNode(), root.left);
            }
            if(root1.right != null || root2.right != null){
                root.right = new TreeNode();
                recursion(root1.right != null ? root1.right : new TreeNode(), root2.right != null ? root2.right : new TreeNode(), root.right);
            }

        }
    }
}
