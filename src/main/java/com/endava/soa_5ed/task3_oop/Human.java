package com.endava.soa_5ed.task3_oop;

public class Human extends Mammal {
    private int heightInCm;
    private int age;
    private String name;

    public Human(String gender, int heightInCm) {
        super(gender);
        this.heightInCm = heightInCm;
        this.age = 0;
        this.name = "Doe";

    }

    public Human(String gender) {
        super(gender);
        this.heightInCm = 50;
        this.age = 0;
        this.name = "Doe";
    }

    public Human(String gender, int heightInCm, int age, String name) {
        super(gender);
        this.heightInCm = heightInCm;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInCm() {
        return this.heightInCm;
    }

    public void setHeightInCm(int height) {
        if (height > 15 && height <= 220) {
            this.heightInCm = height;
        } else {
            System.out.println("We're sorry, but you must prove that your height of " + height + " cm is a valid one");
        }
    }

    public double getHeightInM() {
        return (double)this.heightInCm / 100;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else if (age < 0) {
            System.out.println("Are you kidding? " + age + "is either not valid or you are a very old Benjamin Button");
        } else {
            System.out.println("We are sorry, but you may be dead according to the age you provided. Your provided age: "
                    + age);
        }
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + " is eating. Burp :)");
    }

    @Override
    public void makeSounds() {
        System.out.println(this.name + " is talking..");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(this.name + " is having human dreams..");
    }

    public void sleep(int age) {
        setAge(age);
        if (age >= 0 && age < 4) {
            System.out.println(this.name + " is sleeeping for 14 hours");
        } else if (age >= 4 && age < 12) {
            System.out.println(this.name + " is sleeeping for 10 hours");
        } else if (age >= 12 && age < 20) {
            System.out.println(this.name + " is sleeeping for 9 hours");
        } else if (age >= 20 && age < 40) {
            System.out.println(this.name + " is sleeeping for 7 hours");
        } else if (age >= 40 && age < 60) {
            System.out.println(this.name + " is sleeeping for 6 hours");
        } else {
            System.out.println(this.name + " is sleeeping?");
        }
    }

    public void playWithKitten(Cat cat) {
        System.out.println(getName() + " is playing with " + cat.getName());
    }
}
