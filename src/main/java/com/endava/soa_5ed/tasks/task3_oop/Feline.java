package com.endava.soa_5ed.tasks.task3_oop;

public class Feline extends Mammal implements Tail {
    private String color;

    public Feline(String gender) {
        super(gender);
    }

    public Feline(String gender, String furColor) {
        super(gender);
        this.color = furColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void hasTail() {
        System.out.println("I need my tail to keep my balance.");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat like a savage...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Having feline dreams");
    }

    @Override
    public void makeSounds() {
        System.out.println("Roaring");
    }
}
