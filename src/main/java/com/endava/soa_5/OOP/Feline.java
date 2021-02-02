package com.endava.soa_5.OOP;

public class Feline extends Mammal implements Ability {

    private String color;
    private static final double growingSpeed = 1.36;

    public Feline(boolean feed, int eye, double weight, double height, String race) {
        super(feed, eye, weight, height, race);
    }

    public Feline() {
        super();
    }

    public String eat(String product) {
        if (product.equals("poison")) {
            product = "Your Feline dies";
        }
        return product;
    }

    @Override
    public void run() {
        System.out.println("Feline run");
    }

    public String fastEat(String product, String likeSound) {
        if (product.equals("meat")) {
            likeSound = "hrum-Hrum";
        }
        return likeSound;
    }

    public void produceSound() {
        System.out.println("Noise Sound");
    }

    public double growSpeed() {
        double grow = growingSpeed * 4;

        return grow;
    }

    public int reproduceChild() {
        return 0;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
