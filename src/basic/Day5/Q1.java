package basic.Day5;

import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ans = solution(str);
        if (ans.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.println(ans);
        }

    }

    public static String solution(String code) {
        String answer = "";

        HashMap<Integer, Character> map = new HashMap<>();

        /**
         * mode = 0 => 짝수 인덱스의 값 이어붙임
         * mode = 1 => 홀수 인덱스의 값 이어붙임
         *
         * 일단 인덱스의 값이 1이면 모드를 변환
         * mode를 증가시켜 홀수 or 짝수로 판단?
         */

        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            map.put(i, code.charAt(i));
        }

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                // mode 1
                mode++;
            }
            if (mode % 2 != 0 && i % 2 != 0) {
                if (code.charAt(i) != '1') {
                    answer += map.get(i);
                }
            } else if (mode % 2 == 0 && i % 2 == 0) {
                if (code.charAt(i) != '1') {
                    answer += map.get(i);
                }
            }
        }

        return answer;
    }
}