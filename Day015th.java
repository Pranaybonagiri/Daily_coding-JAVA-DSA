// Leetcode-628. Maximum Product of Three Numbers

// Input: nums = [1,2,3]

// Output: 6

// Explanation:

// The only three numbers are 1, 2, and 3, so the maximum product is 1 * 2 * 3 = 6.

import java.util.*;
public class Day015th {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int product1=arr[n-1]*arr[n-2]*arr[n-3];
        int product2=arr[0]*arr[1]*arr[n-1];

        System.out.println(Math.max(product1,product2));
    }
}
