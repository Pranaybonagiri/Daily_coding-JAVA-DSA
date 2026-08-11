
// Example 1:

// Input: s = "abbaca"
// Output: "ca"
// Explanation: 
// For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
// Example 2:

// Input: s = "azxxzy"
// Output: "ay"


public class LC1047RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        
        String s="abbaca";

        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==ch){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(" Remaining String :"+sb.toString());
    }
    
}
