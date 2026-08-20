
// Leetcode-3345. Smallest Divisible Digit Product I

// Input: n = 10, t = 2

// Output: 10

// Explanation:

// The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.

import java.util.*;
public class Day014th {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
       while(true){
        int temp=n;
        int product=1;
        while(temp>0){
            
            int digit=temp%10;
            product*=digit;
            temp/=10;

    }
    if(product%t==0){
        System.out.println(n);
        return;
    }
    n++;
    }
}
}
