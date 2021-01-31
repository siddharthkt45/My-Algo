package Bit_Manipulation;

import java.util.Scanner;

public class Sum_Of_Bit_Differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    private static long solution(int[] arr) {
        long res = 0;

        for (int i = 0; i < 32; i++) {
            long countOn = 0;

            for (int val : arr) {
                if ((val & (1 << i)) != 0) {
                    countOn++;
                }
            }

            long countOff = arr.length - countOn;
            long diff = countOn * countOff * 2;
            res += diff;
        }

        return res;
    }
}