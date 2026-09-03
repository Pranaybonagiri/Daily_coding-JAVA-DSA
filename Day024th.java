// Leetcode:50. Pow(x, n)

// Input: x = 2.00000, n = 10
// Output: 1024.00000


import java.util.*;
public class Day024th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        double x = sc.nextDouble();
        System.out.println("enter n: ");
        int n = sc.nextInt();
       
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
        }

        double res = 1.0;

        while (power > 0) {

            if (power % 2 == 1) {
                res *= x;
            }

            x *= x;
            power /= 2;
        }

        if (n < 0) {
            res = 1.0 / res;
        }

        return res;
    }
}