package Bit_Manipulation;

import java.util.Scanner;

public class Copy_Set_Bits_In_A_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter left range boundary: ");
        int left = sc.nextInt();
        System.out.print("Enter right range boundary: ");
        int right = sc.nextInt();
        System.out.println("The new number is: " + solution(a, b, left, right));
    }

    private static int solution(int a, int b, int left, int right) {
        int mask = (1 << (right - left + 1));       // taking m1 = 1 and performing m1 << (right - left + 1)
        mask--;                                     // performing (m1 << 5) - 1
        mask = (mask << (left - 1));                // performing [(m1 << 5) - 1] << 2

        mask = (a & mask);                          // performing masking to create a new mask

        b = (b | mask);                             // performing OR operation to toggle the bits

        return b;
    }
}
