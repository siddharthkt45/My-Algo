package Bit_Manipulation;

import java.util.Scanner;

public class All_Repeating_Except_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of input array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        int xor = 0;

        for (int val : arr) {
            xor = xor ^ val;
        }

        System.out.println("The unique element is: " + xor);
    }
}