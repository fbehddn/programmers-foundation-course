package basic.Day20;

public class Q3 {
    public int solution(String[] strArr) {
        int[] arr = new int[30];

        for (int i = 0; i<strArr.length; i++) {
            int idx = strArr[i].length();
            arr[idx]++;
        }
        int max = -1;
        for (int i : arr) {
            if(i>max) max = i;
        }
        return max;
    }
}
