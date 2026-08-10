// Example 1:

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// Example 2:

// Input: n = 3
// Output: [-1,0,1]
// Example 3:

// Input: n = 1
// Output: [0]

/**
 * LC1304FindNUniqueIntegersSumuptoZero
 */
import java.util.Scanner;
import java.util.Arrays;
public class LC1304FindNUniqueIntegersSumuptoZero {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        int left=0,right=n-1,i=0;

        while(left<right){
            arr[left]=i;
            arr[right]=-i;
            left++;
            right--;
            i++;
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}