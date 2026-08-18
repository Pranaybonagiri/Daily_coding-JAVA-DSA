// 3136. Valid Word

// Example 1:

// Input: word = "234Adas"

// Output: true

// Explanation:

// This word satisfies the conditions.

/**
 * Day012
 */
import java.util.*;
public class Day012 {

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    System.out.println("enter string:");

    String s=sc.nextLine();

    if(s.length()<3) {
        System.out.println(false);
        return;
    }
boolean lower=false,vowel=false,consonant=false;

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(ch>='0' && ch<='9'){
            continue;
        }

        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                vowel=true;
            }
            else{
                consonant=true;
            }
        }
        else{
            System.out.println(s+" is not a valid word.");
            return;
        }
    }
    
    System.out.println(s+" is a valid word.");

sc.close();
    
}
}