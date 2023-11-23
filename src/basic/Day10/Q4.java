package basic.Day10;

public class Q4 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        int count = c;
        while (count <= my_string.length()) {
            answer += my_string.charAt(c-1);
            c += m;
            count += m;
        }
        return answer;
    }
}
