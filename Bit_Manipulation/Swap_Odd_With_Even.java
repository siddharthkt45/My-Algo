package Bit_Manipulation;

import java.util.Scanner;

public class Swap_Odd_With_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int oddMask = 0x55555555;       // since 5 = 0101, 55555555 will be stored as 01010101010101010101010101010101
        int evenMask = 0xAAAAAAAA;      // since A = 1010, AAAAAAAA will be stored as 10101010101010101010101010101010

        int odds = (n & oddMask);
        int evens = (n & evenMask);

        odds = (odds << 1);
        evens = (evens >> 1);

        System.out.println("Swapped number: " + (odds | evens));
    }
}