package introduction.Day8;

public class Q2 {
    public String solution(int age) {
        String str = Integer.toString(age);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += (char) (str.charAt(i) + 'a' - '0');
        }

        return result;
    }
}
