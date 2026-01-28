package com.digaoo.colorednames.gradient;

import java.util.List;

/**
 * Gradient model
 * Modelo de gradiente
 */
public class Gradient {

    private final String id;
    private final List<String> colors;
    private final int speed;

    public Gradient(String id, List<String> colors, int speed) {
        this.id = id;
        this.colors = colors;
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

    public List<String> getColors() {
        return colors;
    }

    public int getSpeed() {
        return speed;
    }
}