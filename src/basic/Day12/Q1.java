package basic.Day12;

import java.util.ArrayList;

public class Q1 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        switch (n) {
            case 1:
                for (int i = 0; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    list.add(num_list[i]);
                }
                break;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
