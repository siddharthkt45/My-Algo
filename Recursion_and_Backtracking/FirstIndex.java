package Recursion_and_Backtracking;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(firstIndexOfOccurrence(arr, key, 0));
    }

    private static int firstIndexOfOccurrence(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        } else {
            int index = firstIndexOfOccurrence(arr, key, idx + 1);  // returns index while climbing up the recursion
            return index;
        }

//        This is a poor approach since we'll have to traverse the whole array and then we'll get the index
//        if (arr[idx] == key) {
//            return idx;
//        } else {
//            return index;
//        }
    }
}