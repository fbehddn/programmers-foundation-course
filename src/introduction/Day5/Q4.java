package introduction.Day5;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = num_list.length - 1; i >= 0; i--) {
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
