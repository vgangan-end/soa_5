package com.endava.soa_5ed.workshop.streams;

public class Cage implements Comparable<Cage> {
    private Animal animal;
    private Float area;

    public Cage(Float area, Animal animal) {
        this.area = area;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = (area > 0) ? area : this.area;
    }

    @Override
    public String toString() {
        return "[" + area + " square meters cage with: " + animal + "]";
    }

    @Override
    public int compareTo(Cage comparedCage) {
        return this.getArea().compareTo(comparedCage.getArea());
    }
}
