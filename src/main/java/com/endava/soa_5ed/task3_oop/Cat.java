package com.endava.soa_5ed.task3_oop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Feline implements Tail {
    private double size;
    private String name;

    public Cat(String gender, String furColor, String name) {
        super(gender, furColor);
        this.name = name;
        log.info("Creating Cat with gender: " + gender + ", fur color: " + furColor + ", name: " + name);
    }

    public Cat(String gender, String furColor, String name, double size) {
        super(gender, furColor);
        this.name = name;
        this.size = size;
        log.info("Creating Cat with gender: " + gender + ", fur color: " + furColor + ", name: " + name + " and size: " + size);
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hasTail() {
        super.hasTail();
        System.out.println("Plus, I use it to communicate my emotions");
    }

    @Override
    public void waveTail(int intensity) {
        switch (intensity) {
            case 0:
                System.out.println("I'm not waving my tail at all");
                break;
            case 1:
                System.out.println("I'm waving my tail with intensity " + intensity + ". I'm relaxed");
                break;
            case 2:
                System.out.println("I'm waving my tail with intensity " + intensity + ". You've got my attention but don't expect too much");
                break;
            case 3:
                System.out.println("I'm waving my tail with intensity " + intensity + ". I'm playful right now, throw a ball for me to catch");
                break;
            case 4:
                System.out.println("I'm waving my tail with intensity " + intensity + ". I'm a savage kitty right now. Rawr!");
                break;
            case 5:
                System.out.println("I'm waving my tail with intensity " + intensity + ". You better hide, I'm mad right now and could scratch you");
                break;
            default:
                System.out.println("I cannot wave my tail with intensity: " + intensity);
        }

    }

    @Override
    public void makeSounds() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat like a savage while being cute...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Purring softly.");
    }
}
