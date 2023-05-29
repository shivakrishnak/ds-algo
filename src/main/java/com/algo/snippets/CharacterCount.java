package com.algo.snippets;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Long> charCounts = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charCounts);
    }
}