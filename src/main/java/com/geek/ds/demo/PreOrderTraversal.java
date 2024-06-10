package com.geek.ds.demo;

import com.geek.ds.tree.BinaryTreeNode;
import com.geek.ds.tree.BinaryTreeOps;

import java.util.ArrayDeque;
import java.util.Deque;

import static com.geek.ds.tree.traversal.PreOrderTraversal.preOrderRecursive;

public class PreOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeOps.createFullBinaryTree();
        System.out.print("PreOrder Iterative: ");
        preOrderIterative(root);
        System.out.print("PreOrder Recursive: ");
        preOrderRecursive(root);
        System.out.println();
    }

    private static void preOrderIterative(BinaryTreeNode root) {
        if(root == null)
            return;
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);
        while(!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pollFirst();
            System.out.print(temp.data + ", ");
            if(temp.right != null)
                stack.offerFirst(temp.right);
            if(temp.left != null)
                stack.offerFirst(temp.left);
        }
        System.out.println();
    }

}

