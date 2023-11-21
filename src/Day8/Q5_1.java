package Day8;

public class Q5_1 {
    public static String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            my_string = swap(my_string, s, e);
        }
        return my_string;
    }

    private static String swap(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < start; i++) {
            sb.append(str.charAt(i));
        }

        for (int i = end; i >= start; i--) {
            sb.append(str.charAt(i));
        }

        for (int i = end + 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
