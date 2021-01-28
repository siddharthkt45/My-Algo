package Bit_Manipulation;

import java.util.Scanner;

public class Print_Abbreviations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        for (int i = 0; i < (1 << str.length()); i++) {
            StringBuilder sb = new StringBuilder();
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);         // this is the character which will be appended
                int b = str.length() - 1 - j;    // since the bits are counted in the manner of a string in this problem

                if ((i & (1 << b)) == 0) {
                    if (count == 0) {
                        sb.append(ch);      // if the count is 0, simply append the character
                    } else {
                        sb.append(count);   // if the count is not 0, firstly append the count
                        sb.append(ch);      // and then append the character
                        count = 0;          // then reset the counter to 0
                    }
                } else {
                    count++;        // we only have to increment the counter when the bit is 1
                }
            }

            if (count > 0)
                sb.append(count);       // again check whether the count is 0 or not and if it isn't, append it

            System.out.println(sb);
        }
    }
}