package com.geek.ds.tree.traversal;

import com.geek.ds.tree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class LevelOrderTraversal {
    
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(11);
        levelOrderIterative(root);
    }

    private static ArrayList<Integer> levelOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Deque<BinaryTreeNode> queue = new LinkedList<>();
        queue.offerFirst(root);
        queue.offerFirst(null);
        ArrayList<Integer> curr = new ArrayList<>();
        while(!queue.isEmpty()) {
            BinaryTreeNode temp = queue.pollLast();
            if(temp != null)
                curr.add(temp.data);
            if(temp.left != null)
                queue.offerFirst(temp.left);
            if(temp.right != null)
                queue.offerFirst(temp.right);

        }
        return res;
    }
}
