package org.example.chap8.prob11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            int numberOfWaysLastMoney = countWaysToPayChargeHelper(charge - coin, coins).size();
            numberOfWays += numberOfWaysLastMoney;
        }

        return numberOfWays;
    }

    public static Set<WayToPay<Integer>> countWaysToPayChargeHelper(int charge, List<Integer> coins) {
        if (charge == 0) {
            WayToPay wayToPayTo0 = new WayToPay(coins);
            return new HashSet<>(Arrays.asList(wayToPayTo0));
        }

        Set<WayToPay<Integer>> resSet = new HashSet<>();

        for (Integer coin :
                coins) {
            Integer lastCharge = charge - coin;
            if (lastCharge < 0) {
                continue;
            }

            Set<WayToPay<Integer>> resSetToPayLastCharge = countWaysToPayChargeHelper(lastCharge, coins);

            for (WayToPay<Integer> wayToPay :
                    resSetToPayLastCharge) {
                WayToPay<Integer> tmp = new WayToPay<Integer>(wayToPay);
                tmp.setCoinNum(coin, wayToPay.getCoinNum(coin) + 1);
                resSet.add(tmp);
            }
        }

        return resSet;
    }

    public static void main(String[] args) {
        int[] hoge = {1, 2, 3,};
        HashSet<WayToPay<Integer>> set = new HashSet<>();

        ArrayList<WayToPay<Integer>> listOfWays = new ArrayList<>();

        WayToPay<Integer> wayToBeAdded = new WayToPay<>(Arrays.asList(5, 6, 7, 8));
        wayToBeAdded.setCoinNum(5, 1);
        listOfWays.add(wayToBeAdded);

        WayToPay<Integer> way2 = new WayToPay<>(Arrays.asList(5, 6, 7, 8));
        way2.setCoinNum(5, 2);
        listOfWays.add(way2);

        for (WayToPay<Integer> way :
                listOfWays) {
            set.add(way);
        }

        for (WayToPay<Integer> way :
                set) {
            System.out.println(way.getCoinToWayMap());
        }
    }
}
