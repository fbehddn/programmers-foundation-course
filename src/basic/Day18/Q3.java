package basic.Day18;

public class Q3 {
    public int solution(String binomial) {
        int answer = 0;
        String[] temp = binomial.split(" ");

        switch (temp[1]) {
            case "+":
                answer = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
                break;
            case "-":
                if(Integer.parseInt(temp[0]) == 0) answer = -Integer.parseInt(temp[2]);
                answer = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            case "*":
                answer = Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        }
        return answer;
    }
}
