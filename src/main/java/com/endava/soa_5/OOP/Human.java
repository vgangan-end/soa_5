package com.endava.soa_5.OOP;

public class Human extends Mammal implements Ability {

    private static final double growSpeed = 1.06;

    public Human() {
    }

    public Human(boolean feed, int eye, double weight, double height, String race) {
        super(feed, eye, weight, height, race);

    }

    public String eat(String product) {
        if (product.toLowerCase().equals("sweet")) {
            product = "mmmmmmm!";
        } else if (product.toLowerCase().equals("salt")) {
            product = "beah";
        }
        return product;
    }

    @Override
    public void run() {
        System.out.println("Human run");
    }

    public void produceSound() {
        System.out.println("Voice");
    }

    public double growSpeed() {
        return 2 * growSpeed;
    }

    public int reproduceChild() {
        if (getOld() < 18) {
            return 0;
        } else {
            return 1;
        }
    }

}
