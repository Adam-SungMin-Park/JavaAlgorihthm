package classExampleTransportation;

import java.util.*;

public class smallestAndLargest {
    public static String solution(String s){
      String [] strArr= s.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for (String s1 : strArr) {
            list.add(Integer.parseInt(s1));
        }
        Collections.sort(list);
        String ans = "";
        ans += list.get(0) +" "+ list.get(list.size()-1);
        return ans;
    }
}
