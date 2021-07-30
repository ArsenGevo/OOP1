package main;

import box.Box;
import test.Man;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(12);
        box1.showVolume();



        Man man1 = new Man("Ilia", 32);
        man1.setAge(22);
        man1.setName("Sanya");
        man1.showManInfo();


    }
}
