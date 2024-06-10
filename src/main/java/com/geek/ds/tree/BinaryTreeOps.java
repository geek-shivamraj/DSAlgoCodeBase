package com.geek.ds.tree;

import java.util.List;
import java.util.Scanner;

public class BinaryTreeOps {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        BinaryTreeNode root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = insertBinaryTreeNode(root, data);
//        }
//        scan.close();

        insertStaticData();

    }

    public static BinaryTreeNode insertStaticData() {
        BinaryTreeNode root = null;
        List<Integer> data = List.of(1,2,5,3,6,4);
        // PreOrder Traversal: 1, 2, 5, 3, 4, 6,
        // PostOrder Traversal:
        // InOrder Traversal:
        // LevelOrder Traversal:
        int size = data.size();
        for(int index = 0; index < data.size(); index++)
            root = insertBinaryTreeNode(root, data.get(index));
        return root;
    }

    private static BinaryTreeNode insertBinaryTreeNode(BinaryTreeNode root, int data) {
        if(root == null)
            return new BinaryTreeNode(data);
        else {
            BinaryTreeNode curr;
            if(data <= root.data) {
                curr = insertBinaryTreeNode(root.left, data);
                root.left = curr;
            } else {
                curr = insertBinaryTreeNode(root.right, data);
                root.right = curr;
            }
            return root;
        }
    }

    public static BinaryTreeNode createFullBinaryTree() {
        BinaryTreeNode root = new BinaryTreeNode(11);
        root.left = new BinaryTreeNode(22);
        root.right = new BinaryTreeNode(33);
        root.left.left = new BinaryTreeNode(44);
        root.left.right = new BinaryTreeNode(55);
        root.left.left.left = new BinaryTreeNode(66);
        root.left.left.right = new BinaryTreeNode(77);
        root.right.left = new BinaryTreeNode(88);
        root.right.right = new BinaryTreeNode(99);
        return root;
    }
}
