package com.digaoo.colorednames;

import com.digaoo.colorednames.events.EventRegistrar;

/**
 * Main mod entry class
 * Classe principal do mod
 */
public class ColoredNamesMod {

    /**
     * Called when the mod is loaded
     */
    public static void onInitialize() {
        EventRegistrar.register();
        System.out.println("[ColoredNames] Mod carregado com sucesso!");
    }
}