package Bit_Manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Gray_Code_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bits: ");
        int n = sc.nextInt();
        System.out.println(2^(n-1));
        System.out.println(solution(n));
    }

    public static ArrayList<String> solution(int n) {
        if(n == 1) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("0");
            baseRes.add("1");
            return baseRes;
        }

        ArrayList<String> recursiveRes = solution(n-1);
        ArrayList<String> myRes = new ArrayList<>();

        for(int i = 0; i < recursiveRes.size(); i++) {
            String rstr = recursiveRes.get(i);
            myRes.add("0" + rstr);
        }

        for(int i = recursiveRes.size() - 1; i >= 0; i--) {
            String rstr = recursiveRes.get(i);
            myRes.add("1" + rstr);
        }

        return myRes;
    }
}