package introduction.Day4;

public class Q4 {
    public double solution(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
