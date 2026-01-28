package com.digaoo.colorednames;

import com.digaoo.colorednames.commands.CommandRegistry;
import com.digaoo.colorednames.utils.ConfigLoader;
import com.digaoo.colorednames.utils.Logger;

/**
 * Classe principal do mod ColoredNames
 */
public class ColoredNamesMod {

    private static ColoredNamesMod instance;

    public ColoredNamesMod() {
        instance = this;
    }

    public void onInitialize() {
        Logger.info("Inicializando mod");

        ConfigLoader.loadAll();
        CommandRegistry.registerAll();

        Logger.info("Mod carregado com sucesso");
    }

    public static ColoredNamesMod getInstance() {
        return instance;
    }
}