package com.endava.soa_5ed.workshop.streams;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
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
    Zoo zoo;

    @BeforeEach
    public void setUp() {
        bear = new Animal("Bear", MEAT, false);
        bearCage = new Cage(85f, bear);
        wolf = new Animal("Wolf", MEAT, false);
        wolfCage = new Cage(57f, wolf);
        giraffe = new Animal("Giraffe", LEAVES, true);
        giraffeCage = new Cage(85f, giraffe);
        panda = new Animal("Panda", LEAVES, true);
        bird = new Animal("Bird", CORN, true);

        zoo = new Zoo("Botanica", "Chisinau");
    }

    @Test
    void checkAddCageToList() {
        zoo.addCageToList(bearCage);
        assertThat("Cage should be added", zoo.getCageList().size(), is(1));
    }

    @Test
    void checkAddMultipleCagesToList() {
        zoo.addMultipleCagesToList(Arrays.asList(bearCage, wolfCage, giraffeCage));
        assertThat("Cage should be added", zoo.getCageList().size(), is(3));
    }
}
