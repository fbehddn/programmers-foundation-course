package introduction.Day3;

import java.util.Arrays;

public class Q2 {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
    }
}
