package basic.Day12;

import java.util.Arrays;

public class Q5 {
    public int[] solution(int[] arr, int[] query) {

        for (int i = 0; i < query.length; i++) {
            if(i%2==0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}

