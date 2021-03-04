package com.endava.soa_5ed.tasks.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    private final Map<String, Address> addresses;
    private final long id;
    private String username;

    private User() {
        addresses = new HashMap<>();
        id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    }

    public User(String username) {
        this();
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Map<String, Address> getAddresses() {
        return this.addresses;
    }

    public List<User> filerUsersByCity(List<User> users, String city) {
        return null;
    }

    public void addAddress(String typeOfAddress, Address address) {
        if (!(this.addresses).containsKey(typeOfAddress.toLowerCase())) {
            addresses.put(typeOfAddress, address);
        } else {
            System.out.println("This type of address already exists");
        }
    }

    public void removeAddress(String typeOfAddress, Address address) {
        addresses.remove(typeOfAddress);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
