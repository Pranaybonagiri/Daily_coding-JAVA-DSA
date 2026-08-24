
// Leetcode-455. Assign Cookies

// Input: g = [1,2,3], s = [1,1]
// Output: 1
// Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
// And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
// You need to output 1.

import java.util.*;
public class Day018th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter g Array size:");
        int n=sc.nextInt();

        int[] g=new int[n];

        System.out.println("enter g array elements: ");
        for(int i=0;i<n;i++){
            g[i]=sc.nextInt();
        }

        System.out.println("enter s Array size:");
        int m=sc.nextInt();

        int[] s=new int[m];

        System.out.println("enter s array elements: ");
        for(int i=0;i<m;i++){
            s[i]=sc.nextInt();
        }

        Arrays.sort(g);
        Arrays.sort(s);

        System.out.println("g : "+Arrays.toString(g));

        System.out.println("s : "+Arrays.toString(s));

        int i=0,j=0,count=0;

        while(i<g.length && j<s.length){

            if(s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);

    }
}
