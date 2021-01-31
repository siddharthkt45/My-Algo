package Bit_Manipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

//        if (n & (n-1)) == 0, n is a power of 2

        int val = (n & (n-1));

        if (val == 0) {
            System.out.println("Yes, " + n + " is a power of 2");
        } else {
            System.out.println("No, " + n + " is NOT a power of 2");
        }
    }
}