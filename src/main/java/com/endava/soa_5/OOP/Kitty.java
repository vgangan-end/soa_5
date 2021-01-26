package com.endava.soa_5.OOP;

public class Kitty extends Feline {
    public Kitty() {
    }

    public Kitty(boolean feed, int eye, double weight, double height, String race) {
        super(feed, eye, weight, height, race);
    }

    public double growSpeed() {
        double grow = 2 * 4;

        return grow;
    }

    @Override
    public int reproduceChild() {
        return super.reproduceChild();
    }

    @Override
    public void run() {
        System.out.println("kitty run");
    }
}
