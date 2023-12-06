package basic.Day19;

import java.util.ArrayList;

public class Q5 {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(list.size() == k) break;
            if(!list.contains(arr[i])) list.add(arr[i]);
        }

        while(list.size()<k) list.add(-1);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
