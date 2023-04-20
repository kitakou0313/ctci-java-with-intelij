package org.example.train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                4, 3, 5, 2, 6
        );

        int sum = list.stream().mapToInt(integer -> integer.intValue()).sum();

    }
}
