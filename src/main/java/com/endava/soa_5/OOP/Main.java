package com.endava.soa_5.OOP;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setRace("British");
        cat.produceSound();
        System.out.println(cat.getRace());
        cat.setColor("White");
        System.out.println(cat.getColor());
        cat.setColor("Blue");
        System.out.println(cat.reproduceChild());
        System.out.println(cat.reproduceChild(2));
        System.out.println("#####################################################################################");

        Kitty kitty = new Kitty();
        kitty.produceSound();
        System.out.println(kitty.growSpeed());
        System.out.println(kitty.getRace());// will be null
        kitty.run();
        System.out.println("#####################################################################################");

        Human human = new Human();
        human.setRace("White");
        System.out.println(human.getRace());
        human.getRace();
        System.out.println(human.growSpeed());
        System.out.println(human.eat("sweet"));
        System.out.println(human.eat("salt"));
        System.out.println(human.eat("bitter"));
        human.setOld(18);
        human.reproduceChild();
        System.out.println(human.reproduceChild());
        System.out.println("#####################################################################################");

        Cat cat2 = new Cat(true, 4, 2.2, 4.4, "DWOROVAIA", "Murzik", 4);
        cat2.setName("murka");
        System.out.println(cat2.getPaws());
        System.out.println(cat2.getName());
        System.out.println(cat2.getRace());
        cat2.setPaws(5);
        System.out.println(cat2.getPaws());
        System.out.println("#####################################################################################");
    }
}
