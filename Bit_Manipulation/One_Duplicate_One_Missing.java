package Bit_Manipulation;

import java.util.Scanner;

public class One_Duplicate_One_Missing {
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
        int xor = 0;

//        through this for loop, we're doing xor operation on the elements of the given array
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

//        through this for loop, we're doing xor operation on the extra elements which we are adding in order to
//        create duplicacy
        for (int i = 0; i <= arr.length; i++) {
            xor = xor ^ i;
        }

        int rsbm = xor & -xor;      // created a rightmost set bit mask

        int x = 0;
        int y = 0;

//        through this for loop, we're eliminating duplicate elements in the given array
        for (int val : arr) {
            if ((val & rsbm) == 0) {
                x = x ^ val;
            } else {
                y = y ^ val;
            }
        }

//        through this for loop, we're eliminating duplicate elements in the extra elements that we added
        for (int i = 0; i <= arr.length; i++) {
            if ((i & rsbm) == 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }

//        in this for loop, we check for the missing and the duplicate element and print them
        for (int val : arr) {
            if (val == x) {
                System.out.println("Missing element -> " + y);
                System.out.println("Duplicate element -> " + x);
                break;
            } else if (val == y) {
                System.out.println("Missing element -> " + x);
                System.out.println("Duplicate element -> " + y);
                break;
            }
        }
    }
}