package basic.Day3;

public class Q4 {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a) + Integer.toString(b);
        String strB = Integer.toString(b) + Integer.toString(a);


        return (Integer.parseInt(strA) >= Integer.parseInt(strB)) ?
                Integer.parseInt(strA) : Integer.parseInt(strB);
    }
}
