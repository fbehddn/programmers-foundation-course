package Day4;

public class Q2 {
    public int solution(int number, int n, int m) {

        return (number % n == 0) && (number % m == 0) ? 1 : 0;
    }
}
