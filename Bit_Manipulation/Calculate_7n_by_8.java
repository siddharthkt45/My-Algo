package Bit_Manipulation;

import java.util.Scanner;

public class Calculate_7n_by_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int val = (((n << 3) - n) >> 3);
        System.out.println("The quotient is: " + val);
    }
}
