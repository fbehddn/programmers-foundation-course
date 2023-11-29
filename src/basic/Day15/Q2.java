package basic.Day15;

public class Q2 {
    public int solution(int[] arr) {
        int loop = 0;

        while (true) {
            int change = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0 && arr[i] >=50) {
                    arr[i] = arr[i] / 2;
                    change++;
                }
                else if (arr[i]%2!=0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                    change++;
                }
            }
            loop++;
            if(change==0) {
                return loop - 1;
            }
        }
    }
}
