
// Leetcode-1528. Shuffle String

// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

import java.util.*;
public class Day017th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter s:");
        String s=sc.nextLine();

        int[] indices=new int[s.length()];

        System.out.println("enter indices:");

        for(int i=0;i<indices.length;i++){
            indices[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(indices));

        char[] ch=new char[indices.length];

        for(int i=0;i<ch.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        System.out.println(new String(ch));
        sc.close();
        
    }
}
