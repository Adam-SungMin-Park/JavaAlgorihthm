import java.util.*;
import java.util.stream.Collectors;

public class leastSum {
    public static int solution(int[] a, int[] b){
        int ans =0;

        List<Integer> firstArr = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> secondArr = Arrays.stream(b).boxed().collect(Collectors.toList());

        for (int i : a) {
            
        }
        
        
        Collections.sort(firstArr);
        Collections.sort(secondArr, Collections.reverseOrder());


        for(int i = 0 ; i < firstArr.size(); i++){
            ans+= firstArr.get(i) * secondArr.get(i);
        }
        return ans;
    }
}