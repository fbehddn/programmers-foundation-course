package basic.Day10;

public class Q2 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] strArr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            strArr[i] = my_string.substring(0, i);
        }

        for (String s : strArr) {
            if (is_prefix.equals(s)) return 1;
        }
        return answer;
    }
}
