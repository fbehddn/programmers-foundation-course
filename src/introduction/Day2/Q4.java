package introduction.Day2;

public class Q4 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        int i=0;
        for (int number : numbers) {
            answer[i] = number * 2;
            i++;
        }
        return answer;
    }
}
