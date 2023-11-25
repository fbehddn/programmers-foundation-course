package introduction.Day5;

public class Q2 {
    public int[] solution(int money) {
        int[] answer = new int[2];

        while (money >= 5500) {
            answer[0]++;
            money -= 5500;
        }
        answer[1] = money;

        return answer;
    }
}
