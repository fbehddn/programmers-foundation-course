package basic.Day19;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
            }else if(stk.get(stk.size()-1) != arr[i]){
                stk.add((arr[i]));
                i++;
            }
        }
        if (stk.size()==0) stk.add(-1);
        return stk.stream().mapToInt(num -> num).toArray();
    }
}
