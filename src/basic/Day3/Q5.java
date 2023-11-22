package basic.Day3;

public class Q5 {
    public int solution(int a, int b) {
        int answer = 0;

        String ab = Integer.toString(a) + Integer.toString(b);
        int twoab = 2 * a * b;

        return Integer.parseInt(ab) >= twoab ? Integer.parseInt(ab) : twoab;
    }
}
