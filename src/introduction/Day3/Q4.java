package introduction.Day3;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
