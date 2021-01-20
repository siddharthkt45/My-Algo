package Bit_Manipulation;

import java.util.Scanner;

public class Josephus_Problem_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The last remaining element will be: " + solution(n));
    }

//    the formula is -
//          n = 2^x + l
//          lastRemainingElement = 2 * l + 1

//    In the common Josephus Problem, every kth person is killed, but here we are killing every 2nd person

    public static int solution(int n) {
        int hp2 = powerOf2(n);
        int l = n - hp2;

        return (2 * l) + 1;
    }

    public static int powerOf2(int n) {
        int i = 1;
        while (i * 2 <= n) {
            i = i * 2;
        }

        return i;
    }
}
