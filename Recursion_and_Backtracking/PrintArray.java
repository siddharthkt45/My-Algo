package Recursion_and_Backtracking;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArray(arr, 0);
    }

    private static void displayArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx + 1);
    }
}