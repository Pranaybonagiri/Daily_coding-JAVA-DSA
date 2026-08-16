
// 287. Find the Duplicate Number

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
// Example 3:

// Input: nums = [3,3,3,3,3]
// Output: 3

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Day010t {

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

        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){
            if(set.contains(num)){
                System.out.println(num);
                return;
            }
            set.add(num);
        }
}
}
