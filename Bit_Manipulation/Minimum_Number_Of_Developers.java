package Bit_Manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Minimum_Number_Of_Developers {

    static ArrayList<Integer> sol = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of skills: ");
        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Enter the skills one by one: ");
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), i);
        }

        System.out.print("Enter the number of developers: ");
        int np = sc.nextInt();      // np stands for number of persons/developers

        int people[] = new int[np];
        for (int i = 0; i < np; i++) {
            System.out.print("Enter the number of skills for developer " + (i+1) + ": ");
            int personSkills = sc.nextInt();
            System.out.println("Enter the developer's skills one by one: ");
            for (int j = 0; j < personSkills; j++) {
                String skill = sc.next();
                int snum = map.get(skill);
                people[i] = people[i] | (1 << snum);
            }
        }

        solution(people, n, 0, new ArrayList<>(), 0);
        System.out.println(sol);
    }

    private static void solution(int[] people, int nskills, int cp, ArrayList<Integer> onesol, int smask) {
        if (cp == people.length) {
            if (smask == (1 << nskills) - 1) {
                if (sol.size() == 0 || onesol.size() < sol.size()) {
                    sol = new ArrayList<>(onesol);
                }
            }
            return;
        }
        solution(people, nskills, cp + 1, onesol, smask);   // no

        onesol.add(cp);
        solution(people, nskills, cp + 1, onesol, (smask | people[cp]));
        onesol.remove(onesol.size() - 1);
    }
}