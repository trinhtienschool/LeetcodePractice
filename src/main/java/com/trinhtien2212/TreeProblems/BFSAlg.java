package com.trinhtien2212.TreeProblems;

import java.util.*;

public class BFSAlg {
    /**
     * Binary Tree Level Order Traversal
     * Leetcode link: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (Objects.isNull(root)) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }

    /**
     * Practice level Order
     * Flow:
     * init a queue, add root to queue
     * iterate the queue until the queue is empty
     * new a list
     * get all the same level of nodes of queue and queue its child node
     * add node value to list
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder2(TreeNode root) {

        //init a queue of TreeNode


        if (Objects.isNull(root)) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> values = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                values.add(node.val);
                if (Objects.nonNull(node.left)) queue.add(node.left);
                if (Objects.nonNull(node.right)) queue.add(node.right);
            }
            result.add(values);
        }
        return result;
    }

    /**
     * Binary Tree Level Order Traversal II
     * Leetcode link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/1403443889/
     * @param root
     */
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (Objects.isNull(root)) return new ArrayList<>();

        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> nodes = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                nodes.add(node.val);
                if (Objects.nonNull(node.left)) queue.add(node.left);
                if (Objects.nonNull(node.right)) queue.add(node.right);
            }
            result.addFirst(nodes);
        }
        return result;
    }

    /**
     * Binary Tree Zigzag Level Order Traversal
     * Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
     * @param root
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
       if(Objects.isNull(root)) return new ArrayList<>();
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       List<List<Integer>> result = new ArrayList<List<Integer>>();
       boolean isLeft = false;
      while(!queue.isEmpty()){
          LinkedList<Integer> levels = new LinkedList<Integer>();
          int size = queue.size();
          for(int i=0; i<size; i++){
              TreeNode node = queue.poll();
              if(isLeft){
                  levels.addFirst(node.val);
              }else{
                  levels.addLast(node.val);
              }
              if(Objects.nonNull(node.left)) queue.add(node.left);
              if(Objects.nonNull(node.right)) queue.add(node.right);
          }
          isLeft = !isLeft;
         result.add(levels);
      }
      return result;
    }

    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode root = ArrayToTreeConvertor.convertTree(array);
//        List<List<Integer>> result = levelOrder2(root);
//        List<List<Integer>> result = levelOrderBottom(root);
        List<List<Integer>> result = zigzagLevelOrder(root);
        System.out.println(result);

    }
}
