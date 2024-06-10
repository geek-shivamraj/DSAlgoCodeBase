package com.geek.gfg.top50array;

public class TreeNode {
    private int key;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int key) { this.key = key; }

    public int key() { return key; }
    public TreeNode left() { return left; }
    public TreeNode right() { return right; }

    public void setLeft(TreeNode left) { this.left = left; }
    public void setRight(TreeNode right) { this.right = right; }
}
