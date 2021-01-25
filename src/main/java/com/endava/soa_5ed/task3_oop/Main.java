package com.endava.soa_5ed.task3_oop;

public class Main {
    public static void main(String[] args) {
        Cat tabby = new Cat("female", "ginger", "Tabby", 1.4);
        tabby.hasTail();
        tabby.eat();
        tabby.waveTail(5);

        Human chris = new Human("helicopter", 175, 19, "Chris");
        chris.makeSounds();
        chris.setGender("male");
        System.out.println(chris.getName() + " is " + chris.getGender());
        chris.sleep(chris.getAge());
        chris.playWithKitten(tabby);
    }
}
