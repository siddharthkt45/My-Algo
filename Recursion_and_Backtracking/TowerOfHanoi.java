package Recursion_and_Backtracking;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();
        towerOfHanoi(n, t1d, t2d, t3d);
    }

    public static void towerOfHanoi(int n, int t1d, int t2d, int t3d) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n-1, t1d, t3d, t2d);   // will print the instructions to move n-1 disks from t1 to t3 using t2
        System.out.println(n + "[" + t1d + " -> " + t2d + "]");
        towerOfHanoi(n-1, t3d, t2d, t1d);
    }
}
