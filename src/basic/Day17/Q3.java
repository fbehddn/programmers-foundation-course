package basic.Day17;

import java.util.ArrayList;

public class Q3 {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : strArr) {
            if(!(s.contains("ad"))) list.add(s);
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(0);
        }
        return answer;
    }
}
