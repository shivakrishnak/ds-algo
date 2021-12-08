package com.shiva.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
      HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            if (results.get(i) == 1) {
                map.putIfAbsent(competitions.get(i).get(0), 0);
                map.put(competitions.get(i).get(0), map.get(competitions.get(i).get(0)) + 1);
            }
            if (results.get(i) == 0) {
                map.putIfAbsent(competitions.get(i).get(1), 0);
                map.put(competitions.get(i).get(1), map.get(competitions.get(i).get(1)) + 1);
            }
        }
        int max = 0;
        String winner = null;
        for(Map.Entry<String, Integer> score: map.entrySet()) {
            if (score.getValue() > max) {
                max = score.getValue();
                winner = score.getKey();
            }
        }
        System.out.println(map.get(winner));
        return winner;
    }

}
