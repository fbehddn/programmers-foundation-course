package LV1;

import java.util.HashMap;

class runningRace {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int n = map.get(calling);

            String forwardMan = players[n - 1]; //"poe"

            players[n - 1] = calling;
            map.put(calling, n - 1);

            players[n] = forwardMan;
            map.put(forwardMan, n);
        }

        return players;
    }
}
