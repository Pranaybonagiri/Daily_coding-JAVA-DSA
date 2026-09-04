
// Leetcode:2427. Number of Common Factors

// Input: a = 12, b = 6
// Output: 4
// Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.

import java.util.*;
public class Day025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.println("Enter the second number (b): ");
        int b = sc.nextInt();

        int result = commonFactors(a, b);
        System.out.println("The number of common factors is: " + result);
    }

    public static int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
