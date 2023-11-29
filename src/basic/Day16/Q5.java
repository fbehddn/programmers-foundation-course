package basic.Day16;

public class Q5 {
    public String solution(String my_string, String alp) {
        my_string = my_string.replaceAll(alp, alp.toUpperCase());

        return my_string;
    }
}
