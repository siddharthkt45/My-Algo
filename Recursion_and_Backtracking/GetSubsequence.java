package Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = getSubsequence(str);
        System.out.println(res);
    }

    private static ArrayList<String> getSubsequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);      // ros -> Rest Of String
        ArrayList<String> rres = getSubsequence(ros);   // call for the shorter string or substring

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }

        return mres;
    }
}