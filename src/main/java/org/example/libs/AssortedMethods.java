package org.example.libs;

public class AssortedMethods {
    public static int genRandomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int genRandomIntBetweenRange(int min, int max) {
        return (int) (min + (max+1 - min) * Math.random());
    }

    public static boolean genRandomBoolean() {
        return genRandomIntBetweenRange(0, 1) == 0;
    }

    public static boolean genRandomBooleanWithProbability(int percentageTrue) {
        return genRandomIntBetweenRange(1, 100) <= percentageTrue;
    }
}
