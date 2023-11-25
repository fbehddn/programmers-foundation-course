package basic.Day13;

import java.util.ArrayList;

public class Q1 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n - 1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
