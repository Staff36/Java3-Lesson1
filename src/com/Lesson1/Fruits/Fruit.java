package com.Lesson1.Fruits;

import java.util.Comparator;

public  abstract class Fruit implements Comparable<Fruit> {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    private int weight;


    @Override
    public int compareTo(Fruit o) {
        if (this.getWeight()==o.getWeight())
            return 0;
        else if (this.getWeight()<o.getWeight())
            return -1;
        else
            return 1;
    }
}
