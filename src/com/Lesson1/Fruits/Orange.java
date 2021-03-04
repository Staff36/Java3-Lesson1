package com.Lesson1.Fruits;

public class Orange extends Fruit{
    @Override
    public String toString() {
        return "Orange{weight=" +super.getWeight()+"}";
    }

    public Orange(int weight) {
        super(weight);
    }
}
