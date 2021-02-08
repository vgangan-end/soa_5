package com.endava.soa_5.collection;

import java.util.concurrent.ThreadLocalRandom;

public class Item {
    private long id;
    private String title;
    private Type type;

    public Item() {
        this.id = ThreadLocalRandom.current().nextInt(0, 999999999);
    }

    public Item(String title, Type type) {
        this();
        this.title = title;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return title;
    }
}