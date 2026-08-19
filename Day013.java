
// Leetcode:2325. Decode the Message

// Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
// Output: "this is a secret"
// Explanation: The diagram above shows the substitution table.
// It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".


/**
 * Day013
 */
import java.util.*;
public class Day013 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter Key String:");

        String key=sc.nextLine();

        System.out.println("enter Message String:");

        String message=sc.nextLine();

        HashMap<Character,Character> map=new HashMap<>();
        int index=0;
        
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);

            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch,(char)('a'+index));
                index++;
            }
        }
        StringBuilder sb=new StringBuilder();

        for(char ch:message.toCharArray()){
            if(ch==' '){
                sb.append(" ");
            }
            else{
                sb.append(map.get(ch));
            }
        }
        System.out.println("After Decoding message: "+sb.toString());

    }
    
}