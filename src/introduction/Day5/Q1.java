package introduction.Day5;

public class Q1 {
    public int solution(int price) {
        int result = 0;
        if (price >= 100000 && price <300000) {
            result = (int)(price - price * 0.05);
        } else if (price >= 300000 && price < 500000) {
            result = (int)(price - price * 0.1);
        } else if (price >= 500000) {
            result = (int) (price - price * 0.2);
        } else {
            result = price;
        }
        return result;
    }
}
