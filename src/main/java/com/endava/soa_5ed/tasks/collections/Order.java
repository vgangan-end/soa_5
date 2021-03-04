package com.endava.soa_5ed.tasks.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Order {
    private List<Item> items;
    private final long id;

    private final LocalDate date;
    private User user;

    private Order() {
        items = new ArrayList<>();
        id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        date = LocalDate.now();
    }

    public Order(User user) {
        this();
        this.user = user;
    }

    public long getId() {
        return this.id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + this.id +
                ", date=" + this.date +
                ", user=" + this.user.getUsername() +
                ", items=" + this.items +
                '}';
    }
}
