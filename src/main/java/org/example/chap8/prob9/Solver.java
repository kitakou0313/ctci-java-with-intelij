package org.example.chap8.prob9;

import java.util.HashSet;
//　()
// ()(), (())
// ()()(), (())(),()(()), ()()() , (()())

public class Solver {
    public static HashSet<String> genAllParenPatterns(int parenPairNum) {
//        parenのペア数で生成できるparen文字列の網羅
        HashSet<String> res = new HashSet<>();

        if (parenPairNum == 1) {
            res.add("()");
            return res;
        }

        HashSet<String> parenPatternsN_1 = genAllParenPatterns(parenPairNum - 1);
        for (String parenPatternN_1 : parenPatternsN_1
        ) {
            res.add("()" + parenPatternN_1);
            res.add("(" + parenPatternN_1 + ")");
            res.add(parenPatternN_1 + "()");
        }

        return res;
    }
}
