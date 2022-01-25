package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MockList {


    {
        List<Integer> arrayList = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            arrayList.add(i);
        }
        list = arrayList;
    }

    private final List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public List<String> coveredWordList() {
        return list
                .stream().map(item ->
                new GameNumber(item)
                        .coveredWord())
                .collect(Collectors.toList());
    }
}
