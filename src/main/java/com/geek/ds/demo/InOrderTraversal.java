package com.geek.ds.demo;

import com.geek.ds.tree.BinaryTreeNode;
import com.geek.ds.tree.BinaryTreeOps;

public class InOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeOps.createFullBinaryTree();
        System.out.print("InOrder Iterative: ");
        inOrderIterative(root);
        System.out.println();
        System.out.print("InOrder Recursive: ");
        inOrderRecursive(root);
        System.out.println();
    }

    private static void inOrderIterative(BinaryTreeNode root) {
    }

    private static void inOrderRecursive(BinaryTreeNode root) {
        if(root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + ", ");
            inOrderRecursive(root.right);
        }
    }
}
