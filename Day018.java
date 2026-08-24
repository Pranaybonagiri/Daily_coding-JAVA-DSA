// Leetcode-167. Two Sum II - Input Array Is Sorted

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].


import java.util.*;

/**
 * Day018
 */
public class Day018 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array : "+Arrays.toString(arr));

        System.out.println("enter Target:");


        int target=sc.nextInt();

        int left=0,right=n-1;

        while(left<right){

            int sum=arr[left]+arr[right];

            if(sum==target){
                System.out.println(Arrays.toString(new int[] {left+1,right+1}));
                return;
            }

            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(Arrays.toString(new int[]{}));
     sc.close();
        return;


    }
}