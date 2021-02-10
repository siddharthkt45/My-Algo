package Recursion_and_Backtracking;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);      // this line prints in decreasing order
        printDecreasing(n-1);    // this line makes recursive call
    }
}