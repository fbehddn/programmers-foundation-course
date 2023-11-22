package basic.Day5;

public class Q4 {
    public int solution(int[] num_list) {
        int mult = 0;
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mult *= num_list[i];
        }

        return Math.pow(sum, 2) > mult ? 1 : 0;
    }
}
