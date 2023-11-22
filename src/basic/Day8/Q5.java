package basic.Day8;

public class Q5 {
    public String solution(String my_string, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            String tempStr = swap(my_string, s, e);
            String head = null;
            String mid = null;
            String tail = null;

            for (int j = 0; j < s; j++) {
                head += my_string.charAt((i));
            }
            for (int j = e; j < my_string.length(); j++) {
                tail += my_string.charAt((i));
            }

            my_string = null;

            my_string = head + tempStr + tail;

        }
        return my_string;
    }

    private String swap(String myString, int s, int e) {
        char[] charArr = myString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = e; i >= s; i--) {
            sb.append(myString.charAt(e));
        }

        return sb.toString();
    }
}
