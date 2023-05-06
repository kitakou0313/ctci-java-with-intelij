package org.example.chap8.prob4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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

    public static HashSet<Integer> convertBitVectorToIntSet(int bitVector, ArrayList<Integer> originalSet) {
        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        while (bitVector > 0) {
            if ((bitVector & 1) == 1) {
                set.add(originalSet.get(index));
            }

            bitVector >>= 1;
            index++;
        }

        return set;
    }

    public static HashSet<HashSet<Integer>> genPowerSetWithRecursive(HashSet<Integer> originalSet) {
        HashSet<HashSet<Integer>> resSet = new HashSet<>();

        if (originalSet.size() == 0) {
            resSet.add(new HashSet<Integer>());
            return resSet;
        }

        HashSet<Integer> originalSetCopy = new HashSet<>(originalSet);
        int removedElem = 0;

        for (int elem :
                originalSetCopy) {
            removedElem = elem;
            break;
        }
        originalSetCopy.remove(removedElem);

        HashSet<HashSet<Integer>> powerSetsN_1 = genPowerSetWithRecursive(originalSetCopy);
        resSet.addAll(powerSetsN_1);

        for (HashSet<Integer> powerSet : powerSetsN_1
        ) {
            HashSet<Integer> tmpSet = new HashSet(powerSet);
            tmpSet.add(removedElem);
            resSet.add(tmpSet);
        }

        return resSet;
    }

    public static HashSet<HashSet<Integer>> genPowerSetWithBit(ArrayList<Integer> originalSet) {
// bit全探索で生成
        int setSize = originalSet.size();
        final int MAX = 1 << setSize;

        HashSet<HashSet<Integer>> res = new HashSet<>();
        for (int bit = 0; bit < MAX; bit++) {
            res.add(convertBitVectorToIntSet(bit, originalSet));

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
