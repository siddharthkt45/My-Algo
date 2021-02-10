package Recursion_and_Backtracking;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);      // this line prints in decreasing order
        pdi(n-1);                // this line makes recursive call
        System.out.println(n);      // this line prints in increasing order
    }
}