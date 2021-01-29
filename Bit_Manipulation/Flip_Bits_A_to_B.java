package Bit_Manipulation;

import java.util.Scanner;

public class Flip_Bits_A_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("No. of bits to be flipped: " + flipBitsAToB(a, b));
    }

    private static int flipBitsAToB(int a, int b) {
//        take the xor of both these numbers
        int xor = a ^ b;

//        apply Kernighan's algorithm to calculate the set bits
        int count = 0;

        while (xor != 0) {
            int rsbm = xor & -xor;
            xor -= rsbm;
            count++;
        }

        return count;
    }
}