package com.Lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class TestArray <T>{
    private T[] data;
    private static final int DEFAULT_CAPACITY=4;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    private int size=0;
    public T[] getData() {
        return data;
    }

    public TestArray(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.capacity=capacity;
    }
    public TestArray() {
        this(DEFAULT_CAPACITY);
    }
    public boolean mixUpTwoValues(int firstIndex, int secondIndex){
        if (isIncorrectIndex(firstIndex) || isIncorrectIndex(secondIndex)){
            throw new IllegalArgumentException("Incorrect index first index: "+firstIndex+
                    ", second index: "+secondIndex+", current range 0-"+(data.length-1));
        }

        T temp= data[firstIndex];
        data[firstIndex]=data[secondIndex];
        data[secondIndex]=temp;
        return true;
    }

    public ArrayList<T> convertToArrayList(){
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, data);
        return arrayList;
    }

    public boolean add(T value){
        if (isFull()){
            return false;
        }
        data[size++]=value;
        return true;
    }

    private boolean isIncorrectIndex(int index){
        return index < 0 || index > data.length;
    }

    public boolean isFull(){
        return size==data.length;
    }

    public void display(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }



}
