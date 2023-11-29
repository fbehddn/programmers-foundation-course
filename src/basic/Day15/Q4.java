package basic.Day15;

import java.util.Arrays;

public class Q4 {
    public int solution(int[] num_list) {
        int mul = 1;
        for (int i : num_list) {
            mul *= i;
        }
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() : mul;
    }
}
