package org.example.chap1.solver;

public class SovlerProb2 {
    public static class SolverProb2 {
        public static String sort(String str) {
            char[] chars = str.toCharArray();
            java.util.Arrays.sort(chars);

            String sortedStr = new String(chars);

            return sortedStr;
        }

        public static boolean isPermutation(String str1, String str2) {
            return SolverProb2.sort(str1).equals(SolverProb2.sort(str2));
        }

    }
}
