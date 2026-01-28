package com.digaoo.colorednames.admin;

/**
 * Handles admin and operator rules
 * Controla regras de administrador e operador
 */
public class AdminManager {

    public static boolean isAdmin(String rank) {
        return "ADMIN".equalsIgnoreCase(rank);
    }

    public static boolean isOperator(String rank) {
        return "OPERATOR".equalsIgnoreCase(rank);
    }

    public static boolean forceAdminColor() {
        return true; // configurável futuramente
    }
}