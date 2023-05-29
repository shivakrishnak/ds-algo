package com.algo.snippets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 6, 8, 10);

        List<Integer> duplicateEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate even numbers: " + duplicateEvenNumbers);
    }
}
