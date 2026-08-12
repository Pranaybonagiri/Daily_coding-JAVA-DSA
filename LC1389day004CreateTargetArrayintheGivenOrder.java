// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
// Output: [0,4,1,3,2]
// Explanation:
// nums       index     target
// 0            0        [0]
// 1            1        [0,1]
// 2            2        [0,1,2]
// 3            2        [0,1,3,2]
// 4            1        [0,4,1,3,2]

import java.util.Arrays;

/**
 * LC1389CreateTargetArrayintheGivenOrder
 */
/**
 * 004LC1389CreateTargetArrayintheGivenOrder
 */
/**
 * LC1389day004CreateTargetArrayintheGivenOrder
 */
public class LC1389day004CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {
        
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};

        int[] arr=new int[nums.length];

        int size=0;

        for(int i=0;i<arr.length;i++){


            for(int j=size;j>index[i];j--){

                arr[j]=arr[j-1];

            }
            arr[index[i]]=nums[i];
            size++;
        }
        System.out.println(Arrays.toString(arr));
    }
}