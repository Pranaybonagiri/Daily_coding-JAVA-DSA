

// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

import java.util.Arrays;

/**
 * Day010
 */
public class Day010 {

    public static void main(String[] args) {

        int[] arr={1,0,2,3,0,4,5,0};

        int[] arr1 = new int[arr.length];

        int i = 0;
        int k = 0;

        while (k < arr.length && i < arr.length) {

            if (arr[k] == 0) {

                arr1[i] = 0;
                i++;

                // Put the second zero only if space exists
                if (i < arr.length) {
                    arr1[i] = 0;
                    i++;
                }

                k++;
            }
            else {

                arr1[i] = arr[k];
                i++;
                k++;
            }
        }

      System.out.println(Arrays.toString(arr1));
    }
}