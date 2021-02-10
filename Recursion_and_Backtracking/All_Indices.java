package Recursion_and_Backtracking;

import java.util.Scanner;

public class All_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int[] iarr = allIndices(arr, key, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    private static int[] allIndices(int[] arr, int key, int idx, int fsf) {     // fsf = found so far
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == key) {
            int[] iarr = allIndices(arr, key, idx + 1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, key, idx + 1, fsf);
            return iarr;
        }
    }
}