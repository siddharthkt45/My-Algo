package Bit_Manipulation;

import java.util.Scanner;

public class Kernighans_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            int rsbm = n & -n;
            n -= rsbm;
            count++;
        }

        System.out.println("No. of set bits are: " + count);
    }
}
