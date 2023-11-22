package basic.Day6;

public class Q4 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < 1; j++) {
                swap(arr,queries[i][j], queries[i][j+1]);
            }
        }
        return arr;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
