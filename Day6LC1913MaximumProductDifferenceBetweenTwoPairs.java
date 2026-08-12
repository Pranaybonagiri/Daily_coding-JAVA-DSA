// Input: nums = [5,6,2,7,4]
// Output: 34
// Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
// The product difference is (6 * 7) - (2 * 4) = 34.


/**
 * Day6LC1913MaximumProductDifferenceBetweenTwoPairs
 */

import java.util.Scanner;
import java.util.Arrays;
public class Day6LC1913MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of an array: ");

        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("enter array elements: ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array: "+Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(arr[n-1]*arr[n-2]-arr[0]*arr[1]);

    }
    
}


///Another Efficient approach using max nd min variables

// int max1=Integer.MIN_VALUE;
// int max2=Integer.MIN_VALUE;

// int min1=Integer.MAX_VALUE;
// int min2=Integer.MAX_VALUE;

// for(int num:arr){

//     if(num>max1){
//         max2=max1;
//         max1=num;
//     }
//     else if(num>max2){
//         max2=num;
//     }
//     else if(num<min1){
//         min2=min1;
//         min1=num;
//     }
//     else if(num<min2){
//         min2=num;
//     }
// }
// System.out.println(max1*max2-min1*min2);
// }
// }