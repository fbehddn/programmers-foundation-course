package basic.Day8;

public class Q4 {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer+= Integer.parseInt(number.charAt(i)+"");
        }

        answer %= 9;
        return answer;
    }
}
