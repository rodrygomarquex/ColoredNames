package com.digaoo.colorednames.utils;

/**
 * Mod logger
 * Logger interno do mod
 */
public class Logger {

    public static void info(String message) {
        System.out.println("[ColoredNames] INFO: " + message);
    }

    public static void error(String message) {
        System.err.println("[ColoredNames] ERROR: " + message);
    }

    public static void warn(String message) {
        System.out.println("[ColoredNames] WARN: " + message);
    }
}