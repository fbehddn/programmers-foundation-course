package basic.Day11;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int start, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i >= end_num; i--) {
            list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
