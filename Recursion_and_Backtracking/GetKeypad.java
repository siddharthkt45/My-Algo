package Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        // 678
        char ch = str.charAt(0);  // 6
        String ros = str.substring(1);  // 78
        ArrayList<String> rres = getKPC(ros);  // 6 words of 78

        ArrayList<String> mres = new ArrayList<>();  // 24 words for 678

        String codesForCh = codes[ch - '0'];
        for (int i = 0; i < codesForCh.length(); i++) {
            char chCode = codesForCh.charAt(i);
            for (String rstr : rres) {
                mres.add(chCode + rstr);
            }
        }

        return mres;
    }
}