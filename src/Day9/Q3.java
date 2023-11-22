package Day9;

public class Q3 {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length() - n, my_string.length());
        return answer;
    }
}
