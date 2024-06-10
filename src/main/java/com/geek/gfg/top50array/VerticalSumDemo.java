package com.geek.gfg.top50array;

import java.util.LinkedList;
import java.util.TreeMap;

public class VerticalSumDemo {
    public static void VerticalSumMain() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.left().setLeft(new TreeNode(4));
        root.left().setRight(new TreeNode(5));
        root.right().setLeft(new TreeNode(6));
        root.right().setRight(new TreeNode(7));
        findVerticalSum(root);
    }

    private static void findVerticalSum(TreeNode root) {
        if(root == null) return;

        TreeMap<Integer, Integer> horizontalMap = new TreeMap<>();
        verticalSumRecursively(root, 0, horizontalMap);
        System.out.println(horizontalMap.entrySet());
    }

    private static void verticalSumRecursively(TreeNode root, int horizontalDist, TreeMap<Integer, Integer> horizontalMap) {
        if(root == null) return;

        verticalSumRecursively(root.left(), horizontalDist - 1, horizontalMap);

        int prevSum = (horizontalMap.get(horizontalDist) == null) ? 0 : horizontalMap.get(horizontalDist);
        horizontalMap.put(horizontalDist, prevSum + root.key());

        verticalSumRecursively(root.right(), horizontalDist + 1, horizontalMap);

        LinkedList<Integer> l = new LinkedList<>();
        
    }
}
