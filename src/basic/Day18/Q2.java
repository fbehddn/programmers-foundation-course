package basic.Day18;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public String[] solution(String myString) {

        String[] temp = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for (String s : temp) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        String[] resultArr = list.toArray(new String[list.size()]);
        Arrays.sort(resultArr);

        return resultArr;
    }
}
