package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        return IntStream.range(0, sourceList.size())
                .filter(idx -> (idx + 1) % 3 == 0)
                .mapToObj(idx -> List.of(sourceList.get(idx), sourceList.get(idx)))
                .flatMap(List::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
