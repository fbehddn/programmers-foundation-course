package basic.Day11;

public class Q3 {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        String[] temp = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = "";
        }

        for (String str : temp) {
            sb.append(str);
        }

        return sb.toString();
    }
}
