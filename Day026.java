
// Leetcode : 1342. Number of Steps to Reduce a Number to Zero

import java.util.*;
public class Day026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = numberOfSteps(num);
        System.out.println("The number of steps to reduce " + num + " to zero is: " + result);
    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
