package Day2;

import java.util.HashMap;

public class Q5 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        char[] myChar = my_string.toCharArray();

        int index = 0;
        for (int i = s; i <= overwrite_string.length()+s; i++) {
            myChar[i] = overwrite_string.charAt(index);
            index++;
        }

        for (char c : myChar) {
            answer += c;
        }

        return answer;
    }
}
