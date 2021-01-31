package Bit_Manipulation;

import java.util.Scanner;

public class Set_Bits_In_First_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        int x = largestPowerOf2InRange(n);
        int bitsUpto2RaiseX = x * (1 << (x - 1));
        int msbFrom2rxToN = n - (1 << x) + 1;    // msbFrom2rxToN - Most Significant Bit from 2 raised to power x to N
        int restBits = n - (1 << x);
        int res = bitsUpto2RaiseX + msbFrom2rxToN + solution(restBits);
        return res;
    }

    private static int largestPowerOf2InRange(int n) {
        int x = 0;

        while ((1 << x) <= n) {
            x++;
        }

        return x - 1;
    }
}