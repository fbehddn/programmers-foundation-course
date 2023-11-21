package Day7;

import java.util.ArrayList;

public class Q4 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            list.add(n);
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();

        return result;
    }
}
