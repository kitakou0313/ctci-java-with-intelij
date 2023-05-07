package org.example.chap8.prob8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Solver {
    public static ArrayList<ArrayList<Integer>> genPermutations(ArrayList<Integer> list) {
        HashSet<Integer> usedElems = new HashSet<>();

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int elem :
                list) {
            usedElems.add(elem);

            ArrayList<ArrayList<Integer>> resN_1 = genPermutations(list, usedElems);
            for (ArrayList<Integer> permutationN_1 :
                    resN_1) {
                ArrayList<Integer> permutationN = new ArrayList<>(permutationN_1);
                permutationN.add(elem);
                res.add(permutationN);
            }

            usedElems.remove(elem);
        }

        return res;
    }

    public static ArrayList<ArrayList<Integer>> genPermutations(ArrayList<Integer> list, HashSet<Integer> usedElems) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (usedElems.size() == list.size()) {
            res.add(new ArrayList<>());
            return res;
        }

        for (int elem :
                list) {
            usedElems.add(elem);

            ArrayList<ArrayList<Integer>> resN_1 = genPermutations(list, usedElems);
            for (ArrayList<Integer> permutationN_1 :
                    resN_1) {
                ArrayList<Integer> permutationN = new ArrayList<>(permutationN_1);
                permutationN.add(elem);
                res.add(permutationN);
            }

            usedElems.remove(elem);
        }

        return res;
    }
}
