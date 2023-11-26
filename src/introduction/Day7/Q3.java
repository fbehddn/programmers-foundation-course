package introduction.Day7;

public class Q3 {
    public int solution(int n, int k) {
        int sum = n * 12000 + k * 2000;
        int count = 0;

        while (n >= 10) {
            count++;
            n -= 10;
        }
        return sum - 2000 * count;
    }
}
