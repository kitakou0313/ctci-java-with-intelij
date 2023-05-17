package org.example.chap8.prob11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WayToPay<K> {
    private HashMap<K, Integer> coinToWayMap;

    public WayToPay(ArrayList<K> coins) {
        for (K coin : coins
        ) {
            coinToWayMap.put(coin, 0);
        }
    }

    public HashMap<K, Integer> getCoinToWayMap() {
        return coinToWayMap;
    }

    @Override
    public boolean equals(Object obj) {
        WayToPay<K> another = (WayToPay<K>) obj;
        for (Map.Entry<K, Integer> e :
                another.getCoinToWayMap().entrySet()) {
            if (this.getCoinToWayMap().get(e.getKey()) != e.getValue()) {
                return false;
            }
        }

        return true;
    }
}

