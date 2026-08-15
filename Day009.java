

// Leetcode-1108. Defanging an IP Address

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"

/**
 * Day009
 */
import java.util.*;
public class Day009 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string:");

        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='.'){
                sb.append("[.]");
            }
                else{
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }

    }