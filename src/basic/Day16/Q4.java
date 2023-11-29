package basic.Day16;

public class Q4 {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");

        return myString;
    }
}
