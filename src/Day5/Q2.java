package Day5;

public class Q2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        int[] intArr = new int[included.length];

        intArr[0] = a;

        for (int i = 1; i < included.length; i++) {
            intArr[i] = intArr[i - 1] + d;
        }

        for (int i = 0; i < intArr.length; i++) {
            if (included[i]) {
                answer += intArr[i];
            }
        }
        return answer;
    }
}
