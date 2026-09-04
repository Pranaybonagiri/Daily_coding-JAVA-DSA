
// Leetcode:3903. Smallest Stable Index I

// Input: nums = [5,0,1,4], k = 3

// Output: 3

// Explanation:

// At index 0: The maximum in [5] is 5, and the minimum in [5, 0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
// At index 1: The maximum in [5, 0] is 5, and the minimum in [0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
// At index 2: The maximum in [5, 0, 1] is 5, and the minimum in [1, 4] is 1, so the instability score is 5 - 1 = 4.
// At index 3: The maximum in [5, 0, 1, 4] is 5, and the minimum in [4] is 4, so the instability score is 5 - 4 = 1.
// This is the first index with an instability score less than or equal to k = 3. Thus, the answer is 3.

import java.util.*;
public class Day025th {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        int result = smallestStableIndex(nums, k);
        System.out.println("The smallest stable index is: " + result);
     }

     public static int smallestStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            int min= Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            int instabilityScore = max - min;
            if (instabilityScore <= k) {
                return i;
            }
        }
        return -1; // If no stable index is found
}
}
