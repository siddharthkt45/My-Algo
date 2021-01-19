import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        int onmask = (1 << i);
        int offmask = ~(1 << j);
        int tmask = (1 << k);
        int cmask = (1 << m);

        System.out.println(n | onmask);
        System.out.println(n & offmask);
        System.out.println(n ^ tmask);
        System.out.println((n & cmask) == 0 ? false : true);
    }
}
