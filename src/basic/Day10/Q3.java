package basic.Day10;

public class Q3 {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        Character[] charArr = new Character[my_string.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            charArr[i] = my_string.charAt(i);
        }

        for (int i = 0; i < s; i++) {
            sb.append(charArr[i]);
        }
        for (int i = e; i >= s; i--) {
            sb.append(charArr[i]);
        }
        for (int i = e + 1; i < my_string.length(); i++) {
            sb.append(charArr[i]);
        }

        answer = sb.toString();
        return answer;
    }
}
