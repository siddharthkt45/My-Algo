public class MathAlgo_FastPower {
    public static void main(String[] args) {

        System.out.println(fastPower(3978432, 5, 1000000007));

    }

    static long fastPower(long a, long b, long n) {
        long res = 1;

        while(b > 0) {
            if((b & 1) != 0) {     // can also be written as (b % 2 != 0), cuz it checks even/odd
                res = (res % n * a % n) % n;
            }

            a = (a % n * a % n) % n;
            b = b >> 1;            // this statement divides b by 2
                                   // we should use bitwise operations cuz they are faster
        }

        return res;
    }
}
