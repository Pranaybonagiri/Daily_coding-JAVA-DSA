
// Leetcode-3959. Check Good Integer

// Input: n = 1000

// Output: false

// Explanation:

// The digits of 1000 are 1, 0, 0, and 0.
// The digitSum is 1 + 0 + 0 + 0 = 1.
// The squareSum is 12 + 02 + 02 + 02 = 1.
// The squareSum - digitSum is 1 - 1 = 0. As 0 is not greater than or equal to 50, the output is false.


import java.util.*;
public class Day016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num:");
        int num=sc.nextInt();

        int digitSum=0,squareSum=0;

        while(num>0){
            int digit=num%10;
            digitSum+=digit;
            squareSum+=digit*digit;
            num/=10;
        }
        System.out.println((squareSum-digitSum)>=50?true:false);
        sc.close();
    }
}
