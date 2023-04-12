package org.example.libs;

public class TreeNode {
    private int val;

    private TreeNode left;
    private TreeNode right;

    private TreeNode parent;

    private int size;

    public TreeNode(int val) {
        this.val = val;
        this.size = 1;
    }

    public void setLeft(TreeNode left) {
        this.left = left;

        if (left != null) {
            left.parent = this;
        }
    }

    public void setRight(TreeNode right) {
        this.right = right;

        if (right != null) {
            right.parent = this;
        }
    }

    public int getVal() {
        return val;
    }

    public int getSize() {
        return this.size;
    }
}
