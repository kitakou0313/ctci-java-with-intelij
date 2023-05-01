package org.example.chap8.prob1;

public class Solver {
    public static int countWays(int n) {
        if (n < 0){
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            int wayNum = 0;
            for (int i = 1; i <=3 ; i++) {
                wayNum += countWays(n - i);
            }
            return wayNum;
        }
    }
    public static void main(String[] args) {
//        1, 2, 3を加算してnを得る組み合わせの探索
        int n = 20;
        System.out.println(
                countWays(n)
        );

    }
}
