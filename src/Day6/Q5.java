package Day6;

public class Q5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;

            int start = queries[i][0];
            int fin = queries[i][1];
            int k = queries[i][2];

            for (int j = start; j <= fin; j++) {
                if (arr[j] > k && min>arr[j]) {
                    min = arr[j];
                    answer[i] = min;
                }
                if (answer[i] == 0) {
                    answer[i] = -1;
                }
            }

        }
        return answer;
    }

}

