
// Leetcode-1816. Truncate Sentence

// Input: s = "Hello how are you Contestant", k = 4
// Output: "Hello how are you"
// Explanation:
// The words in s are ["Hello", "how", "are", "you", "Contestant"].
// The first 4 words are ["Hello", "how", "are", "you"].
// Hence, you should return "Hello how are you".


import java.util.*;
public class Day008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a string:");

        String s=sc.nextLine();

         System.out.println("enter k words:");

         int k=sc.nextInt();

        int space=0;

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch==' '){
                space++;
            }
            if(space==k){
                break;
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
    
}
