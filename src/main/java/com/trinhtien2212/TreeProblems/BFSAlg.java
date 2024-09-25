package com.trinhtien2212.TreeProblems;

import java.util.*;

public class BFSAlg {
    /**
     *Binary Tree Level Order Traversal
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root){
        if(Objects.isNull(root)) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        queue.add(root);
       while(!queue.isEmpty()){
           List<Integer> level = new ArrayList<>();
           int size = queue.size();
           for(int i = 0; i< size; i++){
               TreeNode node = queue.poll();
               level.add(node.val);
               if(node.left != null) queue.add(node.left);
               if(node.right != null) queue.add(node.right);
           }
           result.add(level);
       }
       return result;
    }

    public static void main(String[] args) {
     Integer[] array = {3,9,20,null,null,15,7};
     TreeNode root = ArrayToTreeConvertor.convertTree(array);
     List<List<Integer>> result = levelOrder(root);
     System.out.println(result);
    }
}
