package org.example.chap8.prob4;

import java.util.ArrayList;
import java.util.HashSet;

public class Solver {
    public static HashSet<HashSet<Integer>> genPowerSet(ArrayList<Integer> set) {
        HashSet<Integer> usedMap = new HashSet<>();

        usedMap.add(set.get(0));
        HashSet<HashSet<Integer>> resN_1 = genPowerSet(set, usedMap);

        HashSet<HashSet<Integer>> res = new HashSet<>(resN_1);

        for (HashSet<Integer> setN_1 :
                resN_1) {
            HashSet<Integer> tmpSet = new HashSet<>(setN_1);
            tmpSet.add(set.get(0));
            res.add(tmpSet);
        }

        return res;
    }

    public static HashSet<HashSet<Integer>> genPowerSet(ArrayList<Integer> set, HashSet<Integer> used) {
        if (set.size() == used.size()) {
            return new HashSet<HashSet<Integer>>(
                    new HashSet<>()
            );
        }

        HashSet<HashSet<Integer>> resN_1 = new HashSet<>();

        int usedElement = 0;

        for (Integer element :
                set) {
            if (used.contains(element)) {
                continue;
            }
            usedElement = element;
            used.add(element);
            resN_1 = genPowerSet(set, used);
            break;
        }

        HashSet<HashSet<Integer>> res = new HashSet<>(resN_1);

        for (HashSet<Integer> setN_1 :
                resN_1) {
            HashSet<Integer> tmpSet = new HashSet<>(setN_1);
            tmpSet.add(usedElement);

            res.add(tmpSet);
        }


        return res;

    }
    public static void main(String[] args) {
//        {1...i}のべき集合を返す
        for (int i = 1; i <=3 ; i++) {
            ArrayList<Integer> set = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                set.add(j);
            }

            HashSet< HashSet<Integer>> res = genPowerSet(set);

            System.out.println(i + "のべき集合のサイズ:" + res.size());
            System.out.println(res);

        }
    }
}
