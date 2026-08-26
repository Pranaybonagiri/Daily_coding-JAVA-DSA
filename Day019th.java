
// Leetcode-3718. Smallest Missing Multiple of K

//     Input: nums = [8,2,3,4,6], k = 2

//     Output: 10

//     Explanation:

//     The multiples of k = 2 are 2, 4, 6, 8, 10, 12... and the smallest multiple missing from nums is 10.

import java.util.*;
public class Day019th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array = "+Arrays.toString(nums));

         System.out.println("enter K: ");
         int k=sc.nextInt();

         List<Integer> list=new ArrayList<>();

         for(int num:nums){
            if(num%k==0){
                list.add(num);
            }
         }

         for(int i=1;i<=list.size()+k;i++){
            int res=k*i;
            if(!list.contains(res)){
                System.out.println(res);
                return;
            }
         }
         System.out.println(k);
         return;
    }
}
