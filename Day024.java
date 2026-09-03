
// Leetcode:2164. Sort Even and Odd Indices Independently

// Input: nums = [4,1,2,3]
// Output: [2,3,4,1]


import java.util.*;
public class Day024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
       
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    public static int[] sortEvenOdd(int[] nums) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList,Collections.reverseOrder());

        int[] result = new int[nums.length];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = evenList.get(evenIndex++);
            } else {
                result[i] = oddList.get(oddIndex++);
            }
        }
        
        return result;
    }
}
