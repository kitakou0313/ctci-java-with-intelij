package org.example.train.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
//        配列

        TestA[] arrayTestA = {
                new TestA(1), new TestA(2)
        };

        TestB[] arrayTestB = {
                new TestB(1, 2)
        };

        arrayTestA = arrayTestB;//これはできる
//        arrayTestB = arrayTestA;

        ArrayList<TestA> testAArrayList = new ArrayList<>();
        ArrayList<TestB> testBArrayList = new ArrayList<>();

//        testAArrayList = testBArrayList;　これはできない
//        配列では継承関係を参照した代入ができるがgenericsだとだめみたい

    }
}
