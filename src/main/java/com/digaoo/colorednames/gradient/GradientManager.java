package com.digaoo.colorednames.gradient;

import java.util.HashMap;
import java.util.Map;

/**
 * Gradient manager
 * Gerenciador de gradientes
 */
public class GradientManager {

    private static final Map<String, Gradient> gradients = new HashMap<>();

    public static void register(Gradient gradient) {
        gradients.put(gradient.getId(), gradient);
    }

    public static Gradient get(String id) {
        return gradients.get(id);
    }
}