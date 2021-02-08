package com.endava.soa_5.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    private long id;
    private String username;
    private Map<String, Address> userAddresses;

    public User() {
        this.id = ThreadLocalRandom.current().nextInt(0, 999999999);
        this.userAddresses = new HashMap<>();
    }

    public User(String username) {
        this();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setAddresses(String key, Address address) {
        this.userAddresses.put(key, address);
        System.out.println();
    }

    public boolean isUserFrom(String city) {
        for (Address address : userAddresses.values()) {
            if (address.getCity().toUpperCase().equals(city.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return username;
    }
}