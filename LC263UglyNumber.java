
// Example 1:

// Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3
// Example 2:

// Input: n = 1
// Output: true
// Explanation: 1 has no prime factors.
// Example 3:

// Input: n = 14
// Output: false
// Explanation: 14 is not ugly since it includes the prime factor 7.
 
import java.util.Scanner;
public class LC263UglyNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");

        int n=sc.nextInt();

        boolean ugly=true;

        if(n<=0){
            ugly=false;
            System.out.println(ugly);
            return;
        }

        while(n!=1){
            if(n%2==0) n/=2;
            else if(n%3==0) n/=3;
            else if(n%5==0) n/=5;
            else { 
            ugly=false;
            System.out.println(ugly);
            return; }
        }

        System.out.println(ugly);

        sc.close();
    }
}
