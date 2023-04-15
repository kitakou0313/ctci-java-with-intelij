package org.example.libs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapList<T,E> {
    private HashMap<T, ArrayList<E>> map = new HashMap<T, ArrayList<E>>();

    public void put(T key, ArrayList<E> items) {
        map.put(key, items);
    }

    public ArrayList<E> get(T key) {
        return map.get(key);
    }

    public boolean containsKey(T key) {
        return map.containsKey(key);
    }

    public Set<T> getKeysSet() {
        return map.keySet();
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
