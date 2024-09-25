package com.trinhtien2212.TreeProblems;

public class BalanceTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) !=-1;
    }
    private int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        if(left ==-1) return -1;
        int right = dfs(root.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root = ArrayToTreeConvertor.convertTree(new Integer[]{3,9,20,null,null,15,7});
        BalanceTree balanceTree = new BalanceTree();
        System.out.println(balanceTree.isBalanced(root));
    }
}
