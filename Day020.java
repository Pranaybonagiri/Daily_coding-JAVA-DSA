
// Leetcode-137. Single Number II

    // Input: nums = [2,2,3,2]
    // Output: 3

import java.util.*;
public class Day020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1 );
        }

        for(int num:map.keySet()){
            if(map.get(num)!=3){
                System.out.println(num);
                return;
            }
        }
        System.out.println("-1");
    }
}
