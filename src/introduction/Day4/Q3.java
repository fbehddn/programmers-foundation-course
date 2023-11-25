package introduction.Day4;

public class Q3 {
    public int solution(int slice, int n) {
        int result = 0;
        while (slice * result < n) {
            result++;
        }
        return result;
    }
}
