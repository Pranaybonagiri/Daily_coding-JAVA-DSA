// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step


/**
 * LC70ClimbingStairs
 */
import java.util.Scanner;
public class LC70ClimbingStairs {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");

        int  n=sc.nextInt();

        int first=1,second=1;

        for(int i=1;i<n;i++){
            int current=first+second;

            first=second;
            second=current;
        }
        System.out.println("Number of Climbing Stairs are: "+second);

        sc.close();
    }
}