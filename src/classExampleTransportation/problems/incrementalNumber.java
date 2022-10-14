package classExampleTransportation.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class incrementalNumber {
    public long [] solution(int x , int y){
        ArrayList<Long> ans = new ArrayList<Long>();
        long num = x;
        int index = 0;
        for( int i = 0; i < y ; i++){
            ans.add(num);
            num+=x;
        }
        long [] test = new long[ans.size()];
        for (Long an : ans) {
            test[index++] = an;
        }
        return test;
    }
}
