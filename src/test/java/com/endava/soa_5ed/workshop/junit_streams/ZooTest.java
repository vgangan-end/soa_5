package com.endava.soa_5ed.workshop.junit_streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class ZooTest {
    Animal bear;
    Animal wolf;
    Animal giraffe;
    Animal panda;
    Animal bird;

    Cage bearCage;
    Cage wolfCage;
    Cage giraffeCage;
    Cage pandaCage;
    Cage birdCage;
    Zoo zoo;

    @BeforeEach
    public void setUp() {
        bear = new Animal("Bear", MEAT, false);
        wolf = new Animal("Wolf", MEAT, false);
        giraffe = new Animal("Giraffe", LEAVES, true);
        panda = new Animal("Panda", LEAVES, true);
        bird = new Animal("Bird", CORN, true);

        bearCage = new Cage(85f, bear);
        wolfCage = new Cage(57f, wolf);
        giraffeCage = new Cage(85f, giraffe);
        pandaCage = new Cage(25f, panda);
        birdCage = new Cage(11f, bird);

        zoo = new Zoo("Botanica", "Chisinau");
        zoo.addMultipleCagesToList(Arrays.asList(bearCage, wolfCage, giraffeCage, pandaCage, birdCage));
    }

    @Test
    void checkFilterCagesByFood() {
        List<Cage> expectedResult = Arrays.asList(giraffeCage, pandaCage);
        assertThat("Cages were filtered by LEAVES food", filterCagesByFood(zoo.getCageList(), LEAVES),
                containsInAnyOrder(expectedResult.toArray()));
    }

    @Test
    void checkFindTheHappiestAnimal() {
        List<Animal> expectedResult = Arrays.asList(bear, giraffe);
        assertThat("Find the animal with the biggest cage", findTheHappiestAnimal(zoo.getCageList()),
                containsInAnyOrder(expectedResult.toArray()));
    }

    @Test
    void checkFindTheHappiestAnimalWithStream() {
        List<Animal> expectedResult = Arrays.asList(bear, giraffe);
        assertThat("Find the animal with the biggest cage with stream", findTheHappiestAnimalWithStream(zoo.getCageList()),
                containsInAnyOrder(expectedResult.toArray()));
    }

    @Test
    void checkCountAllHerbivores() {
        int expectedResult = 2;
        assertThat("Count all Herbovores old way", countAllHerbivores(zoo.getCageList()), is(expectedResult));
    }

    @Test
    void checkCountAllHerbivoresWithStream() {
        int expectedResult = 2;
        assertThat("Count all Herbovores old way", countAllHerbivoresWithStream(zoo.getCageList()), is(expectedResult));
    }
}
