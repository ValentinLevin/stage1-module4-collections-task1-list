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
        Integer intA = Integer.parseInt(a);
        Integer intB = Integer.parseInt(b);
        int compareResult = (5*intA*intA + 3) - (5*intB*intB + 3);
        return compareResult == 0 ? intA - intB : compareResult;
    }
}
