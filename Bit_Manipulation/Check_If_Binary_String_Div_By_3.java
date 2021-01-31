package Bit_Manipulation;

import java.util.Scanner;

public class Check_If_Binary_String_Div_By_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int odd = 0;
        int even = 0;

        for (int i = 0; i < str.length(); i++) {
            int bit = str.charAt(i) - '0';      // this is to convert the char into numerical value using ascii values

            if (i % 2 == 0) {
                even += bit;
            } else {
                odd += bit;
            }
        }

        int delta = even - odd;

        if (delta % 11 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}