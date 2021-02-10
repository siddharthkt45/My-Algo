package Recursion_and_Backtracking;

import java.util.Scanner;

public class Power_Logarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n, p));
    }

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }

//        the formula used is x^n = x^n/2 * x^n/2 : if x is even
//        the formula used is x^n = x^n/2 * x^n/2 * x : if x is odd

        int res = power(n, p/2) * power(n, p/2);        // recursive call

        if (p % 2 == 1) {       // if the power is odd, we need to multiply n once more
            res = res * n;
        }

        return res;
    }
}