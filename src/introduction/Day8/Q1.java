package introduction.Day8;

import java.util.ArrayList;

public class Q1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
