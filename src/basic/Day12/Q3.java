package basic.Day12;

import java.util.ArrayList;

public class Q3 {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                list.add(arr[j]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
