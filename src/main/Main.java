package main;

import box.Box;
import test.Man;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(20,20,10);
        Box box3 = box1.sumBox(box2);
        Box box4 = new Box(box1, box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();

        Man man1 = new Man("Ilia", 32);
        System.out.println(man1.getAge());


    }
}
