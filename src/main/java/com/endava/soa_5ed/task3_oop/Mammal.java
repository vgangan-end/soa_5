package com.endava.soa_5ed.task3_oop;

public abstract class Mammal {
    private final int NR_OF_EYES = 2;
    private String gender;

    public Mammal(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void makeSounds() {
    }

    ;
}
