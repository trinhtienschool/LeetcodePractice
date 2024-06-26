package com.trinhtien2212;

import com.sun.source.tree.Tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {

    }
    public class TreeNode{
        int val;
        TreeNode left;
       TreeNode  right;
       TreeNode(){}
       TreeNode(int val){
           this.val = val;
       }
       TreeNode(int val, TreeNode left, TreeNode right){
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
}
