package org.example.chap10;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solver {
    public static String sortString(String str) {
        char[] charList = str.toCharArray();
        Arrays.sort(charList);
        return new String(charList);
    }

    public static String[] groupStringByAnagram(String[] strings) {
        LinkedList<String> res = new LinkedList<>();

        HashMap<String, Integer> mapSortedStringToAppearedNum = new HashMap<>();

        for (String srt :
                strings) {
            String sortedString = Solver.sortString(srt);
            if (!(mapSortedStringToAppearedNum.containsKey(sortedString))) {
                mapSortedStringToAppearedNum.put(sortedString, 0);
            }
            mapSortedStringToAppearedNum.put(sortedString, mapSortedStringToAppearedNum.get(sortedString) + 1);
        }

        for (Map.Entry<String, Integer> entry :
                mapSortedStringToAppearedNum.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {

    }
}
