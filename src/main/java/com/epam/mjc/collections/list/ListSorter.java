package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int firstResult = computeFunction(first);
        int secondResult = computeFunction(second);
        if (firstResult == secondResult) {
            return Integer.compare(first, second);
        }
        return Integer.compare(firstResult, secondResult);
    }

    private Integer computeFunction(int x) {
        return 5 * x * x + 3;
    }
}
