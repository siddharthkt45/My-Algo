package Bit_Manipulation;

import java.util.Scanner;

public class Reduce_N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(long n) {
        int res = 0;

        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else if (n == 3)
                n = n - 1;
            else if ((n & 3) == 1)      // this operation actually creates a mask which performs AND(&) on the no.
                n = n - 1;              // and determines whether the odd no. is of type 4x + 1
            else if ((n & 3) == 3)      // this operation creates a mask which performs AND(&) on the no. and
                n = n + 1;              // determines whether the odd no. is of type 4x + 3

            res++;
        }

        return res;
    }
}