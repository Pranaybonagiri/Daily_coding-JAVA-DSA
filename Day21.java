

// leetcode:347. Top K Frequent Elements

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]


import java.util.*;
public class Day21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
         System.out.println("enter Array Elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Array :"+Arrays.toString(nums));
        System.out.println("enter value of k:");
        int k=sc.nextInt();
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] arr=new int[k];

        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int element=0;

            for(int key:map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    element=key;
                }
            }
            arr[i]=element;
            map.remove(element);
        }
        System.out.println("Top K Frequent Elements :"+Arrays.toString(arr));
    }
}