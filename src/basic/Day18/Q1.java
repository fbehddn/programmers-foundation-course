package basic.Day18;

import java.util.ArrayList;

public class Q1 {
    public static int[] solution(String myString) {
        String[] temp = myString.split("x");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i].length());
        }

        if(myString.charAt(myString.length()-1) == 'x') list.add(0);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
