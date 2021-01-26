package com.endava.soa_5.OOP;

public abstract class Mammal {

    private boolean feed;
    private int eye;
    private double weight;
    private double height;
    private String race;
    private int old;

    public Mammal() {
    }

    public Mammal(boolean feed, int eye, double weight, double height, String race) {
        this.feed = feed;
        this.eye = eye;
        this.weight = weight;
        this.height = height;
        this.race = race;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public abstract String eat(String product);

    public abstract void run();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
