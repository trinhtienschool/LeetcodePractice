package com.trinhtien2212.TreeProblems;

import com.trinhtien2212.LowestCommonAncestor;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {this.val = x;}
    TreeNode(){}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
