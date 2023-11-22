package basic.Day1;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = new char[str.length()];
        char[] result = new char[arr.length];
        arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (('A' <= arr[i]) && (arr[i] <= 'Z')) {
                result[i] = Character.toLowerCase(arr[i]);
            } else {
                result[i] = Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(result);
    }
}
