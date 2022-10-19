package classExampleTransportation.problems;

import java.util.Arrays;

public class sumOfMissingNumber {
    public int solution(int [] num){
        int sum = 45;
        for (int i = 0 ; i < num.length; i ++){
            sum -= num[i];
        }
        System.out.println(sum);
        return sum;
    }
}
