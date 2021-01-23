package Bit_Manipulation;

import java.util.Scanner;

public class All_Repeating_Except_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        int xxory = 0;

        for (int val : arr) {
            xxory = xxory ^ val;
        }

        int rsbm = xxory & -xxory;

        int x = 0;
        int y = 0;

        for (int val : arr) {
            if ((val & rsbm) == 0) {
                x = x ^ val;
            } else {
                y = y ^ val;
            }
        }

        if (x < y) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(y);
            System.out.println(x);
        }
    }
}