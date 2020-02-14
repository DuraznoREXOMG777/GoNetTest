package com.anlh.exam.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class MyDynamicArray implements MyArrayInterface{

    private ArrayList<String> myArray;

    public MyDynamicArray() {
        myArray = new ArrayList<>();
    }

    @Override
    public void convertToDynamicArray(String[] a) {
        Collections.addAll(myArray, a);
    }

    @Override
    public void clearIndex(int index) {
        myArray.set(index, "");
    }

    @Override
    public ArrayList<String> obtainArray() {
        return myArray.stream().filter(v -> !v.isEmpty()).collect(Collectors.toCollection(ArrayList::new));
    }

}
