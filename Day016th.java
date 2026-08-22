
// Leetcode-3340. Check Balanced String

// Input: num = "1234"

// Output: false

// Explanation:

// The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
// Since 4 is not equal to 6, num is not balanced.

import java.util.*;
public class Day016th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter String:");

        String s=sc.nextLine();

        int evenSum=0,oddSum=0;

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                evenSum+=s.charAt(i)-'0';
            }else{
                oddSum+=s.charAt(i)-'0';
            }
        }
        System.out.println(evenSum==oddSum?true:false);
    }
}
