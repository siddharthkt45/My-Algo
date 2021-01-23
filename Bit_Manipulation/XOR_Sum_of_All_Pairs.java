package Bit_Manipulation;

import java.util.Scanner;

public class XOR_Sum_of_All_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int ans = 0;

        for (int val : arr) {
            ans = ans ^ (2 * val);
        }
        return ans;
    }
}
