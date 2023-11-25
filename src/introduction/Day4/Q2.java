package introduction.Day4;

public class Q2 {
    public int solution(int n) {
        int pizza = 1;
        while ((6 * pizza) % n != 0) {
            pizza++;
        }
        return pizza;
    }
}
