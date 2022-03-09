package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag <T> implements Container <T>{

    List<T> x;

    public Bag(){
        x = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return x.isEmpty();
    }

    @Override
    public int size() {
        return x.size();
    }

    @Override
    public void add(T item) {
        x.add(item);
    }

    @Override
    public Iterator iterator() {
        return x.iterator();
    }
}
