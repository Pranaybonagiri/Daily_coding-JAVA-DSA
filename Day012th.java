
// Leetcode-367. Valid Perfect Square

// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.


import java.util.*;
public class Day012th {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");

        int num=sc.nextInt();

        if(num==0 || num==1) {
            System.out.println(true);
            return;
        }

        for(int i=0;i*i<=num;i++){
            if(i*i==num){
                System.out.println(i);
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }

}