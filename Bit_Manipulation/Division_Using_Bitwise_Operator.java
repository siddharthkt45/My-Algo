package Bit_Manipulation;

import java.util.Scanner;

public class Division_Using_Bitwise_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        long dividend = sc.nextLong();
        System.out.print("Enter the divisor: ");
        long divisor = sc.nextLong();

        System.out.println("Quotient is: " + divisionBitwise(dividend, divisor));
    }

    private static long divisionBitwise(long dividend, long divisor) {

//        checking if the dividend or divisor are negative,
//        if both are negative then the sign of the quotient will be positive (+),
//        if either one of them is negative then the sign of the quotient will be negative (-)
        long sign = ((dividend < 0) ^ (divisor < 0) ? -1 : 1);

//        if negative, convert them to positive by taking absolute value
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        long quotient = 0, temp = 0;

        for (int i = 31; i >= 1; i--) {
            if (temp + (divisor << i) <= dividend) {
                temp += (divisor << i);
                quotient |= 1L << i;
            }
        }

        return (sign * quotient);
    }
}
