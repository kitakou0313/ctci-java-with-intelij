package org.example.chap1.solver;

import java.util.HashSet;
import java.util.Set;

class TestClass {
    private int id;
    private String name;

    public TestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

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
