package basic.Day14;

import java.util.ArrayList;

public class Q2 {
    public String[] solution(String[] names) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) list.add(names[i]);
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
