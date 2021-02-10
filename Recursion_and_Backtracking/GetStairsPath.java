package Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    private static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {                            // when you're already at 0, you have only one move, that is don't move
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {                      // when you're below 0, there is no way you can reach 0
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add(1 + path);
        }

        for (String path : path2) {
            paths.add(2 + path);
        }

        for (String path : path3) {
            paths.add(3 + path);
        }

        return paths;
    }
}