package com.tutorialspoint.patterns.builder;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
