package basic.Day11;

import java.util.ArrayList;

public class Q2 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i%k==0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
