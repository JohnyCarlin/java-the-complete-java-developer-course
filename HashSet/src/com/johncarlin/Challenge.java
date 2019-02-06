package com.johncarlin;

public class Challenge {
    private final String name;

    public Challenge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Challenge) {
            String objName = ((Challenge) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
