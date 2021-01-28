package Bit_Manipulation;

import java.util.Scanner;

public class UTF8_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static boolean solution(int[] arr) {
        int rbytes = 0;
        for (int val : arr) {
            if (rbytes == 0) {
                if ((val >> 7) == 0b0) {    // 1st byte of 1 length char
                    rbytes = 0;
                } else if ((val >> 5) == 0b110) {       // 1st byte of 2 length char
                    rbytes = 1;
                } else if ((val >> 4) == 0b1110) {      // 1st byte of 3 length char
                    rbytes = 2;
                } else if ((val >> 3) == 0b11110) {     // 1st byte of 4 length char
                    rbytes = 3;
                }
            } else {
                if ((val >> 6) == 0b10) {
                    rbytes--;
                } else {
                    return false;
                }
            }
        }

        if (rbytes == 0)
            return true;
        else
            return false;
    }
}
