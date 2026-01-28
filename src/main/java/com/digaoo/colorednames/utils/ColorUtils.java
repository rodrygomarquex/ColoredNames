package com.digaoo.colorednames.utils;

/**
 * Utility class for colors
 * Classe utilitária para cores
 */
public class ColorUtils {

    public static String applyBold(String text) {
        return "**" + text + "**"; // placeholder
    }

    public static String applyColor(String name, String color) {
        return "<" + color + ">" + name + "</" + color + ">";
    }

    public static String applyGradient(String name, String gradientId) {
        return "<gradient:" + gradientId + ">" + name + "</gradient>";
    }
}