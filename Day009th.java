
// Leetcode-643. Maximum Average Subarray I

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000
 
import java.util.*;
public class Day009th {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter array elements: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("Array= "+Arrays.toString(arr));

          System.out.println("enter window size:");

         int k=sc.nextInt();
         
         int sum=0;

         for(int i=0;i<k;i++){

            sum+=arr[i];
         }

         int max=sum,left=0,right=k;

         while(right<n){
            sum=sum-arr[left++]+arr[right++];
            max=Math.max(max,sum);
         }
         System.out.println((double)max/k);
    }
    
}
