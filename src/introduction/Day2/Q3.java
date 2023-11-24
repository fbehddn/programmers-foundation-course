package introduction.Day2;

public class Q3 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int tempN, tempD;

        if (denom1 != denom2) {
            tempN = numer1 * denom2 + numer2 * denom1;
            tempD = denom1 * denom2;
        } else {
            tempN = numer1 + numer2;
            tempD = denom1;
        }

        if (tempN % tempD == 0) {
            answer[0] = tempN / tempD;
            answer[1] = 1;

            return answer;
        }
        int limit = Math.min(tempN, tempD);
        int count = 1;

        for (int i = 1; i <= limit; i++) {
            if (tempN % i == 0 && tempD % i == 0) {
                count = i;
            }
        }
        answer[0] = tempN / count;
        answer[1] = tempD / count;

        return answer;
    }
}
