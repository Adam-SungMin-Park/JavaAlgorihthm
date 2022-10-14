package classExampleTransportation.problems;

import java.util.*;

public class jadenCase {
    public static String solution(String s){

        String sNoSpace = s.replace("  ", "");

        String [] strArr = sNoSpace.split(" ");
        List<String> ansStr = new ArrayList<String>();
        List<String> ans = new ArrayList<String>();
        ansStr.addAll(Arrays.asList(strArr));

        for (int i = 0; i < ansStr.size(); i ++){

            String jadenCase = ansStr.get(i).substring(0,1).toUpperCase() +ansStr.get(i).substring(1,ansStr.get(i).length()).toLowerCase() ;
            ans.add(jadenCase);
        }


        String strJaden = String.join(" ", ans);
        System.out.println(strJaden);
        return strJaden;
    }
}
