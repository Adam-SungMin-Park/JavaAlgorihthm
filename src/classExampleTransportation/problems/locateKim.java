package classExampleTransportation.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class locateKim {
    public String solution(String[] arr){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        int location=0;
        for(int i = 0 ; i < list.size(); i++){
            if(Objects.equals(list.get(i), "Kim")){
                location = i;
            }
        }
        return "김서방은 "+location+"에 있다";
    }
}
