package Day7;

import java.util.ArrayList;

public class Q5 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int index = 0;
        while (index < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[index]);
                index++;
            } else {
                if (arr[index] > stk.get(stk.size() - 1)) {
                    stk.add(arr[index]);
                    index++;
                } else {
                    stk.remove(stk.size() - 1);
                }
            }
        }

        int[] result = stk.stream().mapToInt(i -> i).toArray();

        return result;
    }
}
