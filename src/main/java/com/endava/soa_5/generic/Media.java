package com.endava.soa_5.generic;

public class Media {
    private String title;

    Media(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
