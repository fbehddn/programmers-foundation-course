package basic.Day5;

public class Q5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String sbOdd = "";
        String sbEven = "";


        for (int i : num_list) {
            if (i % 2 == 0) {
                sbEven += Integer.toString(i);
            } else {
                sbOdd += Integer.toString(i);
            }
        }
        answer = Integer.parseInt(sbEven) + Integer.parseInt(sbOdd);

        return answer;
    }
}
