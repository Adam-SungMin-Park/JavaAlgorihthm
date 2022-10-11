package classExampleTransportation;

import java.util.*;

public class baseOfTwoConversion {
    public static int[] solution(String s){
        int [] ans = {};
        int count= 0;
        String [] str = s.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(str));


        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).equals("0")){
                System.out.println("zero found at " + i);

                count++;

            }
        }

        System.out.println(s.toString().replace("0",""));


        int beforeConversion = Integer.parseInt(s.toString().replace("0",""),10);
        String binary = Integer.toBinaryString(beforeConversion);

        System.out.println(binary);






        return ans;
    }
}
