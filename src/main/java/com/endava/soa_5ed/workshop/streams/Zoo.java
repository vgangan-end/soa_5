package com.endava.soa_5ed.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String address;
    private List<Cage> cageList;

    public Zoo(String name, String address) {
        cageList = new ArrayList<>();
        this.name = name;
        this.address = address;
    }

    public void addCageToList(Cage cage) {
        cageList.add(cage);
    }

    public void addMultipleCagesToList(List<Cage> cages) {
        cageList.addAll(cages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Cage> getCageList() {
        return cageList;
    }

    public void setCageList(List<Cage> cageList) {
        this.cageList = cageList;
    }
}
