
// 977. Squares of a Sorted Array

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].


// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

import java.util.Arrays;
import java.util.Scanner;

public class Day010h {
    
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }

        int[] nums=new int[n];

        int left=0,right=n-1,k=n-1;

        while(left<=right){


            if(arr[right]>arr[left]){
                nums[k]=arr[right];
                k--;
                right--;
            }
            else if(arr[left]>=arr[right]){
                nums[k]=arr[left];
                k--;
                left++;
            }
            else{
                arr[k]=arr[left];
                k--;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
}
}
