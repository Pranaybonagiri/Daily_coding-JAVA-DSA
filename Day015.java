// Leetcode-509. Fibonacci Number

// Input: n = 2
// Output: 1
// Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

import java.util.*;

public class Day015{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");

        int n=sc.nextInt();

        if(n<=1){
            System.out.println(n);
            return;
        }
            int a=0;
            int b=1;
            int c=0;

            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }