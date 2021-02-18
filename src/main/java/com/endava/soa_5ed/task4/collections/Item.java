package com.endava.soa_5ed.task4.collections;

import java.util.concurrent.ThreadLocalRandom;

public class Item {
    private final long id;
    private String title;
    private Type type;

    public Item(){
        id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    }

    public Item(String title, Type type) {
        this();
        this.title = title;
        this.type = type;
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
