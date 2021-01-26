package com.endava.soa_5.OOP;

public class Cat extends Feline {
    private String name;
    private int paws;

    public Cat(boolean feed, int eye, double weight, double height, String race, String name, int paws) {
        super(feed, eye, weight, height, race);
        this.name = name;
        this.paws = paws;
    }

    public Cat() {
        super();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    @Override
    public void setRace(String race) {
        super.setRace(race);
    }

    @Override
    public String getRace() {
        return super.getRace();
    }

    @Override
    public void setColor(String color) {
        if (color.toLowerCase().compareTo("blue") != 0) {
            super.setColor(color);
        } else {
            System.out.println("Incorrect color blue");
        }
    }

    @Override
    public void produceSound() {
        System.out.println("meow");
    }


    public int reproduceChild(int age) {
        if (age >= 1) {
            return 3;
        }
        return 0;
    }


    public String fastEat(String product, int time) {
        String message;
        if (time > 5) {
            message = "time expired";

        } else {
            message = "it was close-up";
        }
        return message;
    }
}
