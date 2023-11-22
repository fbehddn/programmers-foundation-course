package basic.Day4;

public class Q3 {
    public int solution(int n) {
        int answer = 0;

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            } else {
                sumEven += Math.pow(i, 2);
            }
        }
        return n % 2 != 0 ? sumOdd : sumEven;
    }
}
