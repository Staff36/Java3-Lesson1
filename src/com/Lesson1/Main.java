package com.Lesson1;

import com.Lesson1.Fruits.Apple;
import com.Lesson1.Fruits.Orange;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        taskOneAndTwo();
        taskThree();
    }

    public static void taskOneAndTwo(){
        System.out.println("Task one and two\n" +
                "Creating new array:");
        TestArray<Integer> integerTestArray = new TestArray<>();
        for (int i = 0; i < integerTestArray.getCapacity(); i++) {
            integerTestArray.add(i+1);
        }
        integerTestArray.display();
        System.out.println("---------------------");
        System.out.println("Mixing up value 2 and 3");
        integerTestArray.mixUpTwoValues(1,2);
        integerTestArray.display();
        System.out.println("----------------------------");
        List testList= integerTestArray.convertToArrayList();
        System.out.println("Displaying arrayList: "+testList);
    }

    public static void taskThree(){
        System.out.println("\nTask three: ");
        MyBox<Apple> appleBox1= new MyBox<>();
        MyBox<Apple> appleBox2= new MyBox<>();
        MyBox<Orange> orangeBox= new MyBox<>();
        for (int i = 0; i < 10; i++) {
            appleBox1.add(new Apple());
            appleBox2.add(new Apple());
            orangeBox.add(new Orange());
        }

        appleBox1.display();
        System.out.println("Apple Box weight is: " +appleBox1.getBoxWeight());
        orangeBox.display();
        System.out.println("Orange Box weight is: " +orangeBox.getBoxWeight());
        System.out.println("Boxes weight is same: "+appleBox1.compare(orangeBox)+"\n");


        System.out.println("Apple Box2 weight is: " +appleBox2.getBoxWeight());
        System.out.println("Pouring apples from box1 to box2");
        appleBox1.pourFruit(appleBox2);
        System.out.println("Apple Box 1 weight is: " +appleBox1.getBoxWeight());
        System.out.println("Apple Box 2 weight is: " +appleBox2.getBoxWeight());

    }
}
