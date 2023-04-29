package org.example.chap4.prob3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.example.libs.AssortedMethods;
import org.example.libs.TreeNode;

public class Solver {
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> res = new ArrayList<>();

        LinkedList<TreeNode> current = new LinkedList<>();
        if (root != null) {
            current.add(root);
        }

        while (current.size() > 0) {
            res.add(current);

            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();

            for (TreeNode parent :
                    parents) {

                if (parent.getLeft() != null) {
                    current.add(parent.getLeft());
                }
                if (parent.getRight() != null) {
                    current.add(parent.getRight());
                }

            }
        }

        return res;
    }

    public static void printResult(ArrayList<LinkedList<TreeNode>> result) {
        int depth = 0;
        for (LinkedList<TreeNode> entry :
                result) {
            Iterator<TreeNode> i = entry.iterator();
            System.out.print("Link list at depth :" + depth);
            while (i.hasNext()) {
                System.out.print(" " + ((TreeNode) i.next()).getVal());
                System.out.println();
                depth++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        TreeNode root = AssortedMethods.createLinkedListFromArray(nodes_flattened);
        TreeNode root = null;
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
        printResult(list);
    }
}
