package basic.Day18;

import java.util.ArrayList;

public class Q4 {
    public int solution(String myString, String pat) {
        char[] charArray = myString.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        String answer = "";

        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == 'A') list.add('B');
            else list.add('A');
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        if(answer.contains(pat)) return 1;

        return 0;
    }
}
