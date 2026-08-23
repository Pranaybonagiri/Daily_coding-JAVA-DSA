
// Leetcode-2839. Check if Strings Can be Made Equal With Operations I

// Input: s1 = "abcd", s2 = "cdab"
// Output: true
// Explanation: We can do the following operations on s1:
// - Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
// - Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.

import java.util.*;

public class Day017 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter s1:");
        String s1=sc.nextLine();

        System.out.println("enter s2:");
        String s2=sc.nextLine();

        int i=0,j=2;

        char[] ch=s1.toCharArray();

        while(j<ch.length){

            if(ch[i]!=s2.charAt(i) && ch[j]!=s2.charAt(j)){

                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
            }
            i++;
            j++;
        }
        s1=new String(ch);

        System.out.println(s1.equals(s2));

    }
}