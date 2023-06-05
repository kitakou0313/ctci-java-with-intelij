package org.example.chap8.prob11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
        HashSet<WayToPay<Integer>> set = new HashSet<>();

        ArrayList<WayToPay<Integer>> listOfWays = new ArrayList<>();

        WayToPay<Integer> wayToBeAdded = new WayToPay<>(Arrays.asList(5, 6, 7, 8));
        wayToBeAdded.getCoinToWayMap().put(5, 1);
        listOfWays.add(wayToBeAdded);

        WayToPay<Integer> way2 = new WayToPay<>(Arrays.asList(5, 6, 7, 8));
        way2.getCoinToWayMap().put(6, 1);
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
