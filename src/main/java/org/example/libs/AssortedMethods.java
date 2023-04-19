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
    
    public static boolean[][] genRandomBooleanMatrix(int M, int N, int percentageTrue){
        boolean[][] matrix = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = AssortedMethods.genRandomBooleanWithProbability(percentageTrue);
            }
        }

        return matrix;
    }

    public static LinkedListNode genLinkedListWithValue(int N, int value) {
        LinkedListNode root = new LinkedListNode(value, null, null);
        LinkedListNode prev = root;

        for (int i = 0; i < N - 1; i++) {
            LinkedListNode next = new LinkedListNode(value, null, null);

            prev.setNext(next);

            prev = next;
        }
        return root;
    }

    public static LinkedListNode createLinkedListFromArray(int[] vals) {
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;

        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], current, null);
        }

        return head;
    }

    public static String arrayToString(int[] array, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            int v = array[i];
            sb.append(v + ",");
        }

        return sb.toString();
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "";
        }

        return arrayToString(array, 0, array.length - 1);
    }


}
