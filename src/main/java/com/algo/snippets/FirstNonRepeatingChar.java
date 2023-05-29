package com.algo.snippets;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "hello world";
//        char nonRepeatingChar = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(new LinkedHashMap<Character, Integer>(), (map, c) -> map.merge(c, 1, Integer::sum), Map::putAll)
//                .entrySet().stream()
//                .filter(e -> (Integer) e.getValue() == 1)
//                .findFirst()
//                .map(Map.Entry::getKey)
//                .orElseThrow(() -> new RuntimeException("No non-repeating character found"));
//
//        System.out.println("First non-repeating character: " + nonRepeatingChar);
    }
}