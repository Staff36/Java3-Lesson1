package com.Lesson1;

import com.Lesson1.Fruits.Fruit;

import java.util.ArrayList;

public class MyBox <T extends Fruit> implements Comparable<MyBox>{
    private ArrayList<T> data = new ArrayList<>();

    public ArrayList<T> getData() {
        return data;
    }

    public void add(T fruit){
        data.add(fruit);
    }

    public float getBoxWeight(){
        float result = 0;
        for (T fruit : data) {
            result += fruit.getWeight();
        }
        return result;
    }

    public void pourFruit(MyBox<T> box){
      for (T fruit : data) {
        box.add(fruit);
      }
      data.clear();
    }

    public boolean compare(MyBox box){
        return compareTo(box) == 0;
    }

    @Override
    public int compareTo(MyBox o) {
        if (this.getBoxWeight()==o.getBoxWeight())
            return 0;
        else if (this.getBoxWeight()>=o.getBoxWeight())
            return 1;
        else
            return -1;
    }

    public void display(){
        System.out.println("Box contain "+data.size()+" fruits");
    }

}
