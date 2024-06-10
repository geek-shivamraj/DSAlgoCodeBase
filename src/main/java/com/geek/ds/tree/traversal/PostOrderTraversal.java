package com.geek.ds.tree.traversal;

import com.geek.ds.tree.BinaryTreeNode;
import com.geek.ds.tree.BinaryTreeOps;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PostOrderTraversal {
    public static void main(String[] args){
        //BinaryTreeNode root = BinaryTreeOps.insertStaticData();
        BinaryTreeNode root = BinaryTreeOps.createFullBinaryTree();
        System.out.print("InOrder Recursive: ");
        postOrderRecursive(root);
        System.out.println();

        System.out.print("Print PreOrder Iterative: ");
      //  printPostOrderIterative(root);
        System.out.println();
//
//        System.out.print("ArrayList PreOrder Iterative: ");
//        ArrayList<Integer> result = postOrderIterative(root);
//        result.stream().forEach(i -> System.out.print(i + ", "));
    }

    private static void printPostOrderIterative(BinaryTreeNode root) {
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);
        BinaryTreeNode prev = null;
        while(!stack.isEmpty()) {
            BinaryTreeNode current = stack.peekFirst();
            if(current.left != null) {
                stack.offerFirst(current.left);
                current = current.left;
            } else {
                if(current.right != null) {
                    stack.offerFirst(current.right);
                    current = current.right;
                } else {
                    System.out.print(stack.pollFirst().data + ", ");
                    current = stack.peekFirst();
                    current.right = null;
                }
            }
        }
    }

    private static void postOrderRecursive(BinaryTreeNode root) {
        if(root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.data + ", ");
        }
    }

    private static ArrayList<Integer> postOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);
        BinaryTreeNode prev = null;
        while(!stack.isEmpty()) {
            BinaryTreeNode current = stack.peekFirst();
            if(current.left != null) {
                stack.offerFirst(current.left);
                current = current.left;
            } else {
                if(current.right != null) {
                    stack.offerFirst(current.right);
                    current = current.right;
                } else {
                    current = stack.pollFirst();
                }
            }
        }
        return res;
    }
}
