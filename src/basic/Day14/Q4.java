package basic.Day14;

public class Q4 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        int idx = 0;
        while (answer <= n) {
            answer += numbers[idx];
            idx++;
        }
        return answer;
    }
}
