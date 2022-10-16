package classExampleTransportation.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hideNumber {
    public String solution(String number) {
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < number.length(); i++) {
            if (i < number.length() - 4) {
                arr.add('*');
            } else {
                arr.add(number.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Character character : arr) {
            ans.append(character);
        }
        return ans.toString();
    }
}
