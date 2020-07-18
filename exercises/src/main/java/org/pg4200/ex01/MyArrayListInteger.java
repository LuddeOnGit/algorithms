package org.pg4200.ex01;

import org.pg4200.ex01.MyListInteger;

public class MyArrayListInteger implements MyListInteger{

    private int[] data;
    private int size = 0;

    public MyArrayListInteger(){
        this(10);
    }

    public MyArrayListInteger(int maxSize){
        data = new int[maxSize];
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) return null;
        return data[index];
    }

    @Override
    public void add(int input) {
        data[size] = input;
        size++;
    }

    @Override
    public int size() {
        return size;
    }
}
