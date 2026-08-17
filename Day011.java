
// 1768. Merge Strings Alternately

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

import java.util.*;
public class Day011 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string 1: ");
        String s1=sc.nextLine();

        System.out.println("enter string 2: ");
        String s2=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        int i=0,j=0;

        while(i<s1.length() || j<s2.length()){
            if(i<s1.length()){
                sb.append(s1.charAt(i));
                i++;
            }

            if(j<s2.length()){
                sb.append(s2.charAt(j));
                j++;
            }
        }
        System.out.println("After Merging Strings Alternatevely: "+sb.toString());
        sc.close();
    }
}
