package Recursion_and_Backtracking;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(lastIndexOfOccurrence(arr, key, 0));
    }

    private static int lastIndexOfOccurrence(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        int index = lastIndexOfOccurrence(arr, key, idx + 1);
        if (index == -1) {
            if (arr[idx] == key) {      // your teammates weren't able to do the work but you did it
                return idx;
            } else {                    // neither your teammates nor you were able to do the work
                return -1;
            }
        } else {
            return index;
        }
    }
}