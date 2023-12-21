package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (Integer value: sourceList) {
            if (value % 2 == 0) {
                resultList.add(value);
            } else {
                resultList.addFirst(value);
            }
        }
        return resultList;
    }
}
