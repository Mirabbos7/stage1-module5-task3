package com.epam.mjc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> filteredList = list.stream().filter(number ->
                number % 2 == 0).collect(Collectors.toList());
        return filteredList;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> upperCaseList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        return upperCaseList;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        return max;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (subSum, element) -> subSum + element);
    }
}
