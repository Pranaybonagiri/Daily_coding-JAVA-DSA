
// Leetcode :1365. How Many Numbers Are Smaller Than the Current Number

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Explanation: 
// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
// For nums[1]=1 does not exist any smaller number than it.
// For nums[2]=2 there exist one smaller number than it (1). 
// For nums[3]=2 there exist one smaller number than it (1). 
// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

import java.util.*;
public class Day023rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
