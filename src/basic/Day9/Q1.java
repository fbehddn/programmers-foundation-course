package basic.Day9;

import java.util.ArrayList;

public class Q1 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = s; j < s+l; j++) {
                sb.append(Integer.parseInt(Character.toString(intStrs[i].charAt(j))));
            }

            if (Integer.parseInt(sb.toString()) >k) {
                list.add(Integer.parseInt(sb.toString()));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
