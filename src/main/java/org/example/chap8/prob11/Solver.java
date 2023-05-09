package org.example.chap8.prob11;

import java.util.ArrayList;
import java.util.Arrays;

public class Solver {
    public static int countWaysToPayCharge(int charge, ArrayList<Integer> coins) {
        if (charge == 0) {
            return 1;
        }
        int numberOfWays = 0;

        for (int coin : coins) {
            int lastCharge = charge - coin;
            if (lastCharge < 0) {
                continue;
            }
            int numberOfWaysLastMoney = countWaysToPayCharge(charge - coin, coins);
            numberOfWays += numberOfWaysLastMoney;
        }

        return numberOfWays;
    }

    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(1, 5, 10, 25));

        int trgCharge = 10;

        int numberOfWay = countWaysToPayCharge(trgCharge, coins);
    }
}
