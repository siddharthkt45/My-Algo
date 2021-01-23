package Bit_Manipulation;

import java.util.Scanner;

public class Triplets_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                val = val ^ arr[k];

                if (val == 0) {
                    c += (k - i);
                }
            }
        }
        System.out.println(c);
    }
}