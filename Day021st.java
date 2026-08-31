
// Leetcode:2951. Find the Peaks

// Input: mountain = [2,4,4]
// Output: []
// Explanation: mountain[0] and mountain[2] can not be a peak because they are first and last elements of the array.
// mountain[1] also can not be a peak because it is not strictly greater than mountain[2].
// So the answer is [].

import java.util.*;
public class Day021st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array: ");
        int n = sc.nextInt();
        int[] mountain = new int[n];

        System.out.println("enter array elements : ");
        for (int i = 0; i < n; i++) {
            mountain[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mountain));

        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }
        System.out.println(peaks);
    }
    
}
