// Leetcode-1688. Count of Matches in Tournament

// Input: n = 7
// Output: 6
// Explanation: Details of the tournament: 
// - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
// - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
// - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
// Total number of matches = 3 + 2 + 1 = 6.


import java.util.*;
public class Day022nd { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of teams: ");
        int n = sc.nextInt();
        int matches = 0;

        while (n > 1) {
            int digit = n / 2;
            matches += digit;
            n = n-digit;
        }
        System.out.println(matches);
    }
}