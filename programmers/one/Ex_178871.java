package programmers.one;

import java.util.HashMap;

/**
 * 1 - 달리기 경주
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */
public class Ex_178871 {

    private HashMap<String, Integer> currentPlayer = new HashMap<>();
    private HashMap<Integer, String> currentRank = new HashMap<>();

    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            currentPlayer.put(players[i], i);
            currentRank.put(i, players[i]);
        }

        for (String calling : callings) {
            Integer callRank = currentPlayer.get(calling);
            String callName = currentRank.get(callRank);
            String frontName = currentRank.get(callRank - 1);

            currentPlayer.put(callName, callRank - 1);
            currentPlayer.put(frontName, callRank);

            currentRank.put(callRank, frontName);
            currentRank.put(callRank - 1, callName);
        }

        for (int i = 0; i < players.length; i++) {
            answer[i] = currentRank.get(i);
        }

        return answer;
    }
}
