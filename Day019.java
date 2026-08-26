
// Leetcode-905. Sort Array By Parity


// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


/**
 * Day019
 */

import java.util.*;
public class Day019 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = "+Arrays.toString(arr));

        int left=0,right=n-1;

        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]%2==0){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Resultanat Array: "+Arrays.toString(arr));
    }
    
}