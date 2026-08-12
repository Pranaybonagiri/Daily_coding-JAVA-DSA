
// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true
 
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");
        int n=sc.nextInt();

        if(n<=0) {
            System.out.println("false");
            return;
    }

    while(n%4==0){
        n/=4;
    }
    System.out.println((n==1)?true:false);
}
}
