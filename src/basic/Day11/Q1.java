package basic.Day11;

public class Q1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                answer[26 + ch - 'a']++;
            } else {
                answer[ch - 'A']++;
            }
        }
        return answer;
    }
}
