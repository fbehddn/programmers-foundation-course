package basic.Day13;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
