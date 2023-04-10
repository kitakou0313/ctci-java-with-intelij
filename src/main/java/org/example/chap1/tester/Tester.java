package org.example.chap1.tester;


import org.example.chap1.solver.*;

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

class TesterProb2 {
    public static void main(String[] args) {
        String[][] pairs = {
                {"apple", "panel"}, {"carrot", "tarroc"}, {"hello", "llloh"}
        };

        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];

            boolean isAnagram = SovlerProb2.SolverProb2.isPermutation(word1, word2);
            boolean isAnagramFasterVerRes = SovlerProb2.SolverProb2.isPermutationFaster(word1, word2);

            System.out.println(word1 + ":" + word2 + ":" + isAnagram + ":" + isAnagramFasterVerRes);
        }
    }
}
