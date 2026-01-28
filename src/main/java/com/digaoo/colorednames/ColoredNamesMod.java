package com.digaoo.colorednames;

/**
 * Main mod class
 * Classe principal do mod
 */
public class ColoredNamesMod {

    private static ColoredNamesMod instance;

    public ColoredNamesMod() {
        instance = this;
    }

    /**
     * Called when the mod is loaded
     * Chamado quando o mod é carregado
     */
    public void onInitialize() {
        System.out.println("[ColoredNames] Mod inicializado com sucesso");

        // Inicializações futuras:
        // - Registrar eventos
        // - Registrar comandos
        // - Carregar configs
    }

    public static ColoredNamesMod getInstance() {
        return instance;
    }
}