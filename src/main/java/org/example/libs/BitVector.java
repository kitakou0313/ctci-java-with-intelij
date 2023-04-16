package org.example.libs;

public class BitVector {
    private static int DATA_SIZE = 32;
    private int length;
    private int[] vector;

    public BitVector(int length) {
        this.length = length;

        if (length % this.DATA_SIZE == 0) {
            vector = new int[length / this.DATA_SIZE];
        } else {
            vector = new int[length / this.DATA_SIZE + 1];
        }
    }

    public int getLength() {
        return this.length;
    }

    public boolean get(int i) {
        int b = vector[i / this.DATA_SIZE];
        int bit_index = i % this.DATA_SIZE;

        if (((b >> bit_index) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void set(int i, boolean flag) {
        if (i >= 0 && i < length) {
            int mask = ~(1 << i);
            int b = vector[i / this.DATA_SIZE] & mask;

            if (flag) {
                vector[i / this.DATA_SIZE] = b | (1 << i);
            } else {
                vector[i / this.DATA_SIZE] = b;
            }
        }
    }
}
