package introduction.Day9;

public class Q3 {
    public String solution(String rsp) {
        String answer = "";
        char[] charArray = rsp.toCharArray();
        for (char c : charArray) {
            if(c=='2') answer += '0';
            else if (c=='0') answer += '5';
            else answer+='2';
        }
        return answer;
    }
}
