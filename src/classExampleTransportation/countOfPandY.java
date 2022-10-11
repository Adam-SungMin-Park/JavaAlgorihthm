package classExampleTransportation;

import java.util.*;

public class countOfPandY {
    public static boolean solution (String s){
        int countOfP = 0;
        int countOfY = 0;
        String [] Py = s.toLowerCase().split("");
        for (String str : Py) {
            if(str.equals("p")){
                countOfP++;
            }
            if(str.equals("y")){
                countOfY++;
            }
        }
        return countOfY==countOfP;
    }
}
