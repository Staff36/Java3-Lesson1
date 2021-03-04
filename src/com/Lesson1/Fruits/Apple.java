package com.Lesson1.Fruits;

public class Apple extends Fruit{
    public Apple(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple{weight="+super.getWeight()+"}";
    }
}
