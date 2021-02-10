package com.endava.soa_5ed.task3_oop;

public interface Tail {
    void hasTail();

    default void waveTail(int intensity) {
        System.out.println("waving its tail");
    }
}