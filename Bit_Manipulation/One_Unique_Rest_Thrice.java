package Bit_Manipulation;

import java.util.Scanner;

public class One_Unique_Rest_Thrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    private static void solution(int[] arr) {
        int tn = Integer.MAX_VALUE, tnp1 = 0, tnp2 = 0;     // tn = 3n, tnp1 = 3n + 1, tnp2 = 3n + 2

        for (int i = 0; i < arr.length; i++) {
            int cwtn = arr[i] & tn;             // cwtn = common with 3n
            int cwtnp1 = arr[i] & tnp1;         // cwtnp1 = common with 3n + 1
            int cwtnp2 = arr[i] & tnp2;         // cwtnp2 = common with 3n + 2

            tn = tn & (~cwtn);          // toggling off the cwtn bit in tn
            tnp1 = tnp1 | cwtn;         // toggling on the cwtn bit in tnp1

            tnp1 = tnp1 & (~cwtnp1);    // toggling off the cwtnp1 bit in tnp1
            tnp2 = tnp2 | cwtnp1;       // toggling on the cwtnp1 bit in tnp2

            tnp2 = tnp2 & (~cwtnp2);    // toggling off the cwtnp2 bit in tnp2
            tn = tn | cwtnp2;           // toggling on the cwtnp2 bit in tn
        }

        System.out.println("The unique number is: " + tnp1);       // since we want the unique number in the array as ans, we print tnp1
    }
}
