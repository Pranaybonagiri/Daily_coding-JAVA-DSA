

// Example 1:

// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.
// Example 2:

// Input: nums = [4,4,4,9,2,4]
// Output: 4
// Explanation: 4 is the even element appears the most.
// Example 3:

// Input: nums = [29,47,21,41,13,37,25,7]
// Output: -1
// Explanation: There is no even element.

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class LC2404MostFrequentEvenElement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size:");
        int n=sc.nextInt();
        
        int[] nums=new int[n];

        System.out.print("enter Array Elements:");

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Array="+Arrays.toString(nums));

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(num%2==0){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    }

    int ans=-1;
    int max=0;
        for(int num:map.keySet()){
            int count=map.get(num);
            if(count>max){
                max=count;
                ans=num;
            }
            else if(count==max && num<ans){
                ans=num;

            }
        }
        System.out.println("Most Frequent Even Element is: "+ans);
    }
    
}
