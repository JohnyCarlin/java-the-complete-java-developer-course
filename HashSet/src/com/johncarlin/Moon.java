package com.johncarlin;

public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Moon.class.toString());
    }
}
