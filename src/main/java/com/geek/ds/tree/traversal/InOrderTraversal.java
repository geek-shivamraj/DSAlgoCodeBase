package com.geek.ds.tree.traversal;

import com.geek.ds.tree.BinaryTreeNode;
import com.geek.ds.tree.BinaryTreeOps;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//LDR
public class InOrderTraversal {
    public static void main(String[] args) {
        //BinaryTreeNode root = BinaryTreeOps.insertStaticData();
        BinaryTreeNode root = BinaryTreeOps.createFullBinaryTree();
        System.out.print("InOrder Recursive: ");
        inOrderRecursive(root);
        System.out.println();

        System.out.print("Print InOrder Iterative: ");
        printInOrderIterative(root);
        System.out.println();

        System.out.print("ArrayList InOrder Iterative: ");
        ArrayList<Integer> result = inOrderIterative(root);
        result.stream().forEach(i -> System.out.print(i + ", "));
    }

    private static void printInOrderIterative(BinaryTreeNode root) {
        if(root == null)
            return;
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        BinaryTreeNode current = root;
        Boolean done = false;
        while(!done) {
            if(current != null) {
                stack.offerFirst(current);
                current = current.left;
            } else {
                if(stack.isEmpty()) {
                    done = true;
                    return;
                }
                current = stack.pollFirst();
                System.out.print(current.data + ", ");
                current = current.right;
            }
        }
    }

    private static void inOrderRecursive(BinaryTreeNode root) {
        if(root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + ", ");
            inOrderRecursive(root.right);
        }
    }

    private static ArrayList<Integer> inOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        BinaryTreeNode current = root;
        boolean done = false;
        while(!done) {
            if(current != null) {
                stack.offerFirst(current);
                current = current.left;
            } else {
                if(stack.isEmpty()) {
                    done = true;
                } else {
                    current = stack.pop();
                    res.add(current.data);
                    current = current.right;
                }
            }
        }
        return res;
    }


}
