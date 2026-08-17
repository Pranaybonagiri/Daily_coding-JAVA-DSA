
// leetcode-125. Valid Palindrome

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

import java.util.*;
public class Day011th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string:");

        String s=sc.nextLine().toLowerCase();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }

        int left=0;
        int right=sb.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(sb.charAt(left)!=sb.charAt(right)){
                isPalindrome=false;
                break;
            }
                left++;
                right--;
            }
            if(isPalindrome){ 
            System.out.println(s+" is a Palindrome.");
            }
            else{
                System.out.println(s+" is not a Palindrome.");
            }
        }
    }
