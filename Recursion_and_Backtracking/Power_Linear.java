package Recursion_and_Backtracking;

import java.util.Scanner;

public class Power_Linear {
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
        int xToPowerN = n * power(n, p-1);
        return xToPowerN;
    }
}