
// Leetcode:326. Power of Three

// Example 1:

// Input: n = 27
// Output: true
// Explanation: 27 = 33
// Example 2:

// Input: n = 0
// Output: false
// Explanation: There is no x where 3x = 0.
// Example 3:

// Input: n = -1
// Output: false
// Explanation: There is no x where 3x = (-1).




import java.util.*;
public class Day007th {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");

        int n=sc.nextInt();

        if(n<=0){
            System.out.println(false);
            return;
        }

        while(n%3==0){
            n/=3;
        }

    System.out.println(n==1?true:false);

    }
    
}
