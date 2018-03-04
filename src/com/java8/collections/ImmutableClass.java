package com.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pavithra Sachidananda on 11/15/17.
 */
public final class
ImmutableClass {

    private final int value;

    private final List<Integer> list;

    public ImmutableClass(int value){
        this.value = value;
        this.list = new ArrayList<>();
    }

    public List<Integer> getList() {
        Collections.unmodifiableList(list);
        return new ArrayList<>(list);
    }

    public int getValue(){
        return value;
    }
}
