package com.geek.ds.tree.traversal;

import com.geek.ds.tree.BinaryTreeNode;
import com.geek.ds.tree.BinaryTreeOps;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//DLR (Data in current node -> left node -> right node
public class PreOrderTraversal {
    public static void main(String[] args){
       // BinaryTreeNode root = BinaryTreeOps.insertStaticData();
        BinaryTreeNode root = BinaryTreeOps.createFullBinaryTree();
        System.out.print("PreOrder Recursive: ");
        preOrderRecursive(root);
        System.out.println();

//        System.out.print("Print PreOrder Iterative: ");
//        printPreOrderIterative(root);
//
//        System.out.print("ArrayList PreOrder Iterative: ");
//        ArrayList<Integer> result = preOrderIterative(root);
//        result.stream().forEach(i -> System.out.print(i + ", "));
    }

    public static void preOrderRecursive(BinaryTreeNode root) {
        if(root != null) {
            System.out.print(root.data + ", ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public static void printPreOrderIterative(BinaryTreeNode root) {
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
    public static ArrayList<Integer> preOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);
        while(!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pollFirst();
            res.add(temp.data);
            if(temp.right != null)
                stack.offerFirst(temp.right);
            if(temp.left != null)
                stack.offerFirst(temp.left);
        }
        return res;
    }
}
