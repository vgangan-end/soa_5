package com.endava.soa_5.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Order {
    private long id;
    private Date dateTime;
    private List<Item> items;
    private User user;

    public Order() {
        this.items = new ArrayList<>();
        this.id = ThreadLocalRandom.current().nextInt(0, 999999999);
        dateTime = new Date();
    }

    public Order(User user) {
        this();
        this.user = user;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public boolean isOrderType(Type type) {
        for (Item item : items) {
            if (item.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }

    public void displayOrderInfo() {
        System.out.println("order nr: " + this.id + " de la data de: " + this.dateTime + " pentru userul: " + this.user.getUsername() + " si itemurile: " + this.items.toString());
    }

    @Override
    public String toString() {
        return items.toString();
    }
}