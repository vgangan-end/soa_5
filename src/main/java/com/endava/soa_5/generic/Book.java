package com.endava.soa_5.generic;

public class Book extends Media {
    private int nrPages;
    private double weight;

    public Book(String title, int nrPages, double weight) {
        super(title);
        this.nrPages = nrPages;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book "
                 + super.toString() +
                ", nrPages= " + nrPages +
                ", weight= " + weight;
    }
}
