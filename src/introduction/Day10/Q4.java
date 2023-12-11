package introduction.Day10;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();

        if (direction.equals("right")) {
            list.add(numbers[numbers.length-1]);
            for (int i = 0; i < numbers.length - 2; i++) {
                list.add(numbers[i]);
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
