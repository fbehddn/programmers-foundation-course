package basic.Day17;

public class Q1 {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat)) + pat;
    }
}
