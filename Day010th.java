
// 1394. Find Lucky Integer in an Array

// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

// Example 2:

// Input: arr = [1,2,2,3,3,3]
// Output: 3
// Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
// Example 3:

// Input: arr = [2,2,2,3,3]
// Output: -1
// Explanation: There are no lucky numbers in the array.

import java.util.*;
public class Day010th {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array:");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ans=-1;

        for(int num:map.keySet()){
            if(num==map.get(num)){
                ans=Math.max(ans,num);
            }
        }
        System.out.println("Lucky integer: "+ans);
    }
}
