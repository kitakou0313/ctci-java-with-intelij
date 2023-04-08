package org.example.chap1.solver;

import java.util.HashSet;
import java.util.Set;

public class Solver {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        Set appearedCharSet = new HashSet();
        for (char c : str.toCharArray()) {
            if (appearedCharSet.contains(c)) {
                return false;
            }
            appearedCharSet.add(c);
        }
        return true;
    }
}
