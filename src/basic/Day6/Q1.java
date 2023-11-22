package basic.Day6;

public class Q1 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int preNum = num_list[num_list.length - 1];
        int ppreNum = num_list[num_list.length - 2];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (preNum > ppreNum) {
            answer[num_list.length] = preNum - ppreNum;
        } else {
            answer[num_list.length] = preNum * 2;
        }
        return answer;
    }
}
