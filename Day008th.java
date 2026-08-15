
// Leetcode-819. Most Common Word

// Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
// Output: "ball"
// Explanation: 
// "hit" occurs 3 times, but it is a banned word.
// "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
// Note that words in the paragraph are not case sensitive,
// that punctuation is ignored (even if adjacent to words, such as "ball,"), 
// and that "hit" isn't the answer even though it occurs more because it is banned.


import java.util.*;
public class Day008th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String s=sc.nextLine().toLowerCase();
        System.out.println("enter Banned word:");
        String[] banned=new String[1];
        for(int i=0;i<banned.length;i++){
            banned[i]=sc.nextLine();
        }


        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z' || ch==' '){
                sb.append(ch);
            }
            else{
                sb.append(" ");
            }
        }

        HashSet<String> set=new HashSet<>();

        for(String str:banned){
            set.add(str);
        }

        String[] words=sb.toString().split("\\s+");


        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++){

            if(set.isEmpty() || !set.contains(words[i])){

                map.put(words[i],map.getOrDefault(words[i],0)+1);
            }
        }

        int max=0;
        String result="";

        for(String ss:map.keySet()){

            if(map.get(ss)>max){
                max=map.get(ss);
                result=ss;
            }
        }

        System.out.println("Most Common Word : "+result);
    }
}
