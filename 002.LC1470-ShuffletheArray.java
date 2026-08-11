// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;

/**
 * LC1470ShuffletheArray
 */
public class LC1470ShuffletheArray {

    public static void main(String[] args) {

        int[] nums={2,5,1,3,4,7};

        int n=3;

        int[] arr=new int[nums.length];

        int left=0,right=n,index=0;

        while(left<n){
            arr[index++]=nums[left++];
            arr[index++]=nums[right++];
        }

        
        System.out.println(Arrays.toString(arr));

    }
}
