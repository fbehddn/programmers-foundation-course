package introduction.Day6;

import java.util.ArrayList;

public class Q1 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = my_string.length()-1; i >= 0; i--) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
