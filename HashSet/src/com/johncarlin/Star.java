package com.johncarlin;

public class Star extends HeavenlyBody {
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Star.class.toString());
    }
}
