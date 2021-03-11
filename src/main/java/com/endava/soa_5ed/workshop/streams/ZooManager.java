package com.endava.soa_5ed.workshop.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooManager {

    public static List<Cage> filterCagesByFood(List<Cage> cageList, Food food) {
        return cageList.stream()
                .filter(cage -> cage.getAnimal().getFood().equals(food))
                .collect(Collectors.toList());
    }

    public static List<Animal> findTheHappiestAnimal(List<Cage> cageList) {
        Float maxArea = -1f;
        List<Animal> animals = new ArrayList<>();
        for (Cage cage : cageList) {
            if (cage.getArea() >= maxArea) {
                maxArea = cage.getArea();
                animals.add(cage.getAnimal());
            }
        }
        return animals;
    }

    public static List<Animal> findTheHappiestAnimalWithStream(List<Cage> cageList) {
        double maxArea = cageList.stream().mapToDouble(Cage::getArea).max().orElse(-1);
        return cageList.stream()
                .filter(cage -> cage.getArea().equals((float) maxArea))
                .flatMap(cage -> Stream.of(cage.getAnimal()))
                .collect(Collectors.toList());
    }

    public static int countAllHerbivores(List<Cage> cageList) {
        int count = 0;
        for (Cage cage : cageList) {
            if (cage.getAnimal().isHerbivore()) {
                count++;
            }
        }
        return count;
    }

    public static int countAllHerbivoresWithStream(List<Cage> cageList) {
        return (int) cageList.stream().filter(cage -> cage.getAnimal().isHerbivore()).count();
    }
}
