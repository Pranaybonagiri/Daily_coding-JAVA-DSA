
// Leetcode-9. Palindrome Number

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left.

import java.util.*;
public class Day013th {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");

        int num=sc.nextInt();

        int rev=0,org=num;

        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(rev==org){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
