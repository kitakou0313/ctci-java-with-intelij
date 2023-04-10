package org.example.chap1.solver;

import java.util.HashMap;
import java.util.Map;

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

        public static boolean isPermutationFaster(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            var charToNumMap = new HashMap<Character, Integer>();

            for (int i = 0; i < str1.length(); i++) {
                char char1 = str1.charAt(i);

                if (!(charToNumMap.containsKey(char1))) {
                    charToNumMap.put(char1, 0);
                }

                charToNumMap.put(char1, charToNumMap.get(char1) + 1);
            }

            for (int i = 0; i < str2.length(); i++) {
                char char2 = str2.charAt(i);

                if (!(charToNumMap.containsKey(char2))) {
                    return false;
                }

                charToNumMap.put(char2, charToNumMap.get(char2) - 1);
            }

            for (Map.Entry<Character, Integer> entry : charToNumMap.entrySet()) {
                if (entry.getValue() != 0) {
                    return false;
                }
            }

            return true;
        }

    }
}
