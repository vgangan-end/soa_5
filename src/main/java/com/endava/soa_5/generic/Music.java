package com.endava.soa_5.generic;

public class Music extends Media{

    private int nrTrack;
    private double length;

    Music(String title, int nrTrack, double length) {
        super(title);
        this.nrTrack = nrTrack;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Music "
                + super.toString() +
                ", nrTrack=" + nrTrack +
                ", length=" + length;
    }
}
