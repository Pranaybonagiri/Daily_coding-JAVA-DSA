

// Leetcode:231.power of two

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false


import java.util.*;
public class Day007 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");

        int n=sc.nextInt();

        if(n<=0) {
            System.out.println(false);
            return;
    }

    while(n%2==0){
        n/=2;
    }
    System.out.println(n==1?true:false);
    
}
}
