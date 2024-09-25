package com.trinhtien2212.TreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayToTreeConvertor {
    //using BFS
    public static TreeNode convertTree(Integer[] array) {
        if (array.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < array.length) {
            TreeNode current = queue.poll();

            if (array[i] != null) {
                current.left = new TreeNode(array[i]);
                queue.add(current.left);
            }
            i++;

            if (i < array.length && array[i] != null) {
                current.right = new TreeNode(array[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                System.out.print(current.val + " ");
                queue.add(current.left);
                queue.add(current.right);
            } else {
                System.out.print("null ");
            }
        }
    }
    public static void main(String[] args) {
        Integer[] array = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode root = ArrayToTreeConvertor.convertTree(array);
        ArrayToTreeConvertor.printTree(root);
    }

}
