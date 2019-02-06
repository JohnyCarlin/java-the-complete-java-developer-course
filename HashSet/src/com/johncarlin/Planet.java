package com.johncarlin;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, Planet.class.toString());
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon.getClass() == Moon.class) {
            return super.addMoon(moon);
        } else {
            System.out.println("Only moons can be satellites of Planets");
            return false;
        }
    }
}
