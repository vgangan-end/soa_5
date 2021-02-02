package com.endava.soa_5.generic;

public class NewsPaper extends Media {
    private int nrPages;
    private double weight;
    private boolean isTrueNews;

    public NewsPaper(String title, int nrPages, double weight, boolean isTrueNews) {
        super(title);
        this.nrPages = nrPages;
        this.weight = weight;
        this.isTrueNews = isTrueNews;
    }

    @Override
    public String toString() {
        return "NewsPaper "
                + super.toString() +
                ", nrPages=" + nrPages +
                ", weight=" + weight +
                ", isTrueNews=" + isTrueNews;
    }
}
