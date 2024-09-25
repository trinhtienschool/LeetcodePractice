package com.trinhtien2212;

public class LowestCommonAncestor {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;

    }
    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);

        if(root.val > max) return lowestCommonAncestor2(root.left, p, q);
        if(root.val < min) return lowestCommonAncestor2(root.right, p, q);
        return root;
    }
}
