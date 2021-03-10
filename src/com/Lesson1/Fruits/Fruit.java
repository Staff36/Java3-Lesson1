package com.Lesson1.Fruits;

import java.util.Comparator;

public  abstract class Fruit implements Comparable<Fruit> {

    private float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Fruit o) {
        if (this.getWeight() == o.getWeight())
            return 0;
        else if (this.getWeight() < o.getWeight())
            return -1;
        else
            return 1;
    }
}
