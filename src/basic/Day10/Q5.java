package basic.Day10;

public class Q5 {
    public String solution(int q, int r, String code) {
        String answer = "";

        int temp = 0;
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}
