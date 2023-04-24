package org.example.libs;

public class TreeNode {
    private int val;

    private TreeNode left;
    private TreeNode right;

    private TreeNode parent;

    private int size;

    public static TreeNode createMinimalBST(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode rootNode = new TreeNode(array[mid]);

        rootNode.setLeft(createMinimalBST(array, start, mid - 1));
        rootNode.setRight(createMinimalBST(array, mid + 1, end));

        return rootNode;
    }

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

    public boolean isBST() {
        if (this.left != null) {
            if (this.val < this.left.val || !(this.left.isBST())) {
                return false;
            }
        }

        if (this.right != null) {
            if (this.val >= this.right.val || !(this.right.isBST())) {
                return false;
            }
        }

        return true;
    }

    public TreeNode find(int trgVal) {
        if (trgVal == this.val) {
            return this;
        }

        if (trgVal <= this.val) {
            return this.left != null ? this.left.find(trgVal) : null;
        }else {
            return this.right != null ? this.right.find(trgVal) : null;
        }
    }
}
