// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  



/**
 * LC2149RearrangeArrayElementsbySign
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class LC2149RearrangeArrayElementsbySign {

    public static void main(String args[]){

        int[] arr={3,1,-2,-5,2,-4};

        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        int[] res=new int[arr.length];

        for(int num:arr){
            if(num>0) pos.add(num);
            else neg.add(num);
        }

        int min=Math.min(pos.size(),neg.size());

        int k=0;
        for(int i=0;i<min;i++){

            res[k]=pos.get(i);
            k++;
            res[k]=neg.get(i);
            k++;
        }

        for(int i=min;i<pos.size();i++){
            res[k]=pos.get(i);
            k++;
        }

        for(int i=min;i<neg.size();i++){
            res[k]=neg.get(i);
            k++;
        }
        System.out.println(Arrays.toString(res));

    }
}
