package org.example.chap8.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void Test1() {
        ArrayList<HashSet<Integer>> testInputs = new ArrayList<>();
        ArrayList<Integer> testAns = new ArrayList<>();

        Integer[] testSet1 = {1};
        testInputs.add(new HashSet<>(Arrays.asList(testSet1)));
        testAns.add(2);

        Integer[] testSet2 = {1,2};
        testInputs.add(new HashSet<>(Arrays.asList(testSet2)));
        testAns.add(4);

        Integer[] testSet3 = {1,2,3};
        testInputs.add(new HashSet<>(Arrays.asList(testSet3)));
        testAns.add(8);

        for (int i = 0; i < testInputs.size(); i++) {
            var res = Solver.genPowerSetWithRecursive(testInputs.get(i));
            System.out.println(res);

            if (testAns.get(i) != res.size()) {
                System.out.println("Not much!:");
                System.out.println(res);
                System.out.println(testAns.get(i));
            }

        }



    }
    public static void main(String[] args) {
        Test.Test1();

    }
}
