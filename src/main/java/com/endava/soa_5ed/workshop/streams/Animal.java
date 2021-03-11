package com.endava.soa_5ed.workshop.streams;

public class Animal implements Comparable<Animal> {
    private String name;
    private Food food;
    private boolean isHerbivore;


    public Animal(String name, Food food, boolean isHerbivore) {
        this.name = name;
        this.food = food;
        this.isHerbivore = isHerbivore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Animal comparedAnimal) {
        return this.getName().compareTo(comparedAnimal.getName());
    }
}
