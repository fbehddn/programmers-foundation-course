package basic.Day17;

public class Q2 {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            for (int j = i; j < myString.length(); j++) {
                if(pat.equals(myString.substring(i,j+1))) answer++;
            }
        }

        return answer;
    }
}
