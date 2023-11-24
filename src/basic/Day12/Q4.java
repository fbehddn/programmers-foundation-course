package basic.Day12;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int s = 0, e = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && cnt == 0) {
                s = i;
                cnt++;
            } else if (arr[i] == 2 && cnt != 0) {
                e = i;
            }
        }

        if(cnt == 0 ) {
            int[] result = {-1};
            return result;
        }

        if(e == 0) list.add(arr[s]);

        for (int i = s; i <= e; i++) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
