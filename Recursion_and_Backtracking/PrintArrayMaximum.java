package Recursion_and_Backtracking;

import java.util.Scanner;

public class PrintArrayMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(displayArrayMaximum(arr, 0));
    }

    private static int displayArrayMaximum(int[] arr, int idx) {
        if (idx == arr.length - 1) {      // since there is no element is after this element,
            return arr[idx];              // this is the largest element for now, so we return this element
        }
        int max = displayArrayMaximum(arr, idx + 1);
        if (max > arr[idx]) {
            return max;
        } else {
            return arr[idx];
        }
    }
}