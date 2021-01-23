package Bit_Manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class No_Of_Valid_Words_For_Each_Puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words you want to enter: ");
        int n = sc.nextInt();
        String words[] = new String[n];
        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter the number of puzzles you want to enter: ");
        int m = sc.nextInt();
        String puzzles[] = new String[m];
        System.out.print("Enter the puzzles: ");
        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.next();
        }

        ArrayList<Integer> ans = findNumOfValidWords(words, puzzles);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(puzzles[i] + " -> " + ans.get(i));
        }
    }

    public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), new ArrayList<Integer>());
        }

        for (String word : words) {
            int mask = 0;
            for (char ch : word.toCharArray()) {
                int bit = ch - 'a';
                mask = mask | (1 << bit);
            }

            HashSet<Character> unique = new HashSet<>();
            for (char ch : word.toCharArray()) {
                if (unique.contains(ch))
                    continue;

                unique.add(ch);
                map.get(ch).add(mask);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (String puzzle : puzzles) {
            int pmask = 0;
            for (char ch : puzzle.toCharArray()) {
                int bit = ch - 'a';
                pmask = pmask | (1 << bit);
            }

            char fch = puzzle.charAt(0);
            ArrayList<Integer> wordsToCheck = map.get(fch);
            int count = 0;
            for (int wmask : wordsToCheck) {
                if ((wmask & pmask) == wmask)
                    count++;
            }

            res.add(count);
        }

        return res;
    }
}
