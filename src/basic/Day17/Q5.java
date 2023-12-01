package basic.Day17;

import java.util.ArrayList;

public class Q5 {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (String s : temp) {
            if(!s.equals("")) list.add(s);
        }

        int idx = 0;
        String[] answer = new String[list.size()];
        for (String s : list) {
            answer[idx++] = s;
        }
        return answer;
    }
}
