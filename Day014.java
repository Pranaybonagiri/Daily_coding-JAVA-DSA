

// Leetcode:3069. Distribute Elements Into Two Arrays I

// Input: nums = [2,1,3]
// Output: [2,3,1]
// Explanation: After the first 2 operations, arr1 = [2] and arr2 = [1].
// In the 3rd operation, as the last element of arr1 is greater than the last element of arr2 (2 > 1), append nums[3] to arr1.
// After 3 operations, arr1 = [2,3] and arr2 = [1].
// Hence, the array result formed by concatenation is [2,3,1].

import java.util.*;
public class Day014 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The input array is: "+Arrays.toString(nums));
        
       List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int last1=arr1.get(arr1.size()-1);
            int last2=arr2.get(arr2.size()-1);
            if(last1>last2){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int[] result=new int[nums.length];
        int index=0;
        for(int num:arr1){
            result[index++]=num;
        }
        for(int num:arr2){
            result[index++]=num;
        }
        System.out.println(Arrays.toString(result));
    }
}