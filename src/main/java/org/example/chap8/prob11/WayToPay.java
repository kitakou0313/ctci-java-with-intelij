package org.example.chap8.prob11;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WayToPay<K> {
    private LinkedHashMap<K, Integer> coinToWayMap;

    public WayToPay(List<K> coins) {
        this.coinToWayMap = new LinkedHashMap<>();
        for (K coin : coins
        ) {
            coinToWayMap.put(coin, 0);
        }
    }

    public LinkedHashMap<K, Integer> getCoinToWayMap() {
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

    @Override
    public int hashCode() {
        int hash = 0;
        int digit = 1;
        for (Map.Entry<K, Integer> e : this.getCoinToWayMap().entrySet()
        ) {
            hash += digit * e.getValue();
            digit *= 10;
        }

        return hash;
    }
}

