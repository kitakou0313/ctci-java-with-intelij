package org.example.chap1.tester;


import org.example.chap1.solver.Solver;

public class Tester {
    public static void main(String[] args) {
        String[] words = {
                "abcde", "hello"
        };

        for (String word : words) {
            var res = Solver.isUniqueChars(word);
            System.out.println(word + ":" + res);
        }
    }
}
