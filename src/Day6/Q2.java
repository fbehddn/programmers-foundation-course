package Day6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int ans = solution(n, str);
        System.out.println(ans);
    }
    public static int solution(int n, String control) {
        int answer = 0;

        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        answer = n;
        return answer;
    }
}
