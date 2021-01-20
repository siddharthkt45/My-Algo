package Bit_Manipulation;

import java.util.Scanner;

public class RightmostSetBit_Masking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rsbm = (n & -n);
        System.out.println(Integer.toBinaryString(rsbm));
    }
}
