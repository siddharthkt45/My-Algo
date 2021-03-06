package Bit_Manipulation;

import java.util.Scanner;

public class Same_Set_Bit_As_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        int k = csb(n);
        System.out.println("Total numbers with same no. of set bits are: " + solution(n, k, 63));
    }

    private static int csb(long n) {
        int count = 0;
        while (n > 0) {
            long rsbm = n & -n;
            n = n - rsbm;
            count++;
        }
        return count;
    }

    private static long solution(long n, int k, int i) {
        if (i == 0) {
            return 0;
        }
        long mask = 1L << i;

        long res = 0;

        if ((n & mask) == 0) {
            res = solution(n, k, i-1);
        } else {
            long res1 = solution(n, k-1, i-1);
            long res0 = ncr(i, k);
            res = res1 + res0;
        }

        return res;
    }

    private static long ncr(long n, long r) {
        if (n < r) {
            return 0L;
        } else if (n == r || r == 0) {
            return 1L;
        }

        long res = 1L;

        for (long i = 0L; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }
}
