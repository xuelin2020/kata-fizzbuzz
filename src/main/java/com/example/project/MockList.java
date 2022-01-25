package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class MockList {
    public List list() {
        List list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        return list;
    }
}
