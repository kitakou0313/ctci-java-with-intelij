package org.example.chap4.prob3;

import java.util.ArrayList;
import java.util.LinkedList;
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
}
