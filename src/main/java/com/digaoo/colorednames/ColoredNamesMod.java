package com.digaoo.colorednames;

import com.digaoo.colorednames.utils.Logger;
import com.digaoo.colorednames.api.HytalePlugin;

/**
 * Hytale-compatible plugin entrypoint.
 * The server's plugin loader should call `onLoad`, `onEnable`, and `onDisable`.
 */
public class ColoredNamesMod implements HytalePlugin {

    public static final String MOD_ID = "colorednames";
    private static ColoredNamesMod INSTANCE;

    public ColoredNamesMod() {
        INSTANCE = this;
    }

    public static ColoredNamesMod getInstance() {
        return INSTANCE;
    }

    @Override
    public void onLoad() {
        Logger.info("ColoredNames mod loading...");
    }

    @Override
    public void onEnable() {
        Logger.info("Enabling ColoredNames mod...");
        try {
            com.digaoo.colorednames.events.EventRegistrar.register();
            Logger.info("ColoredNames mod enabled");
        } catch (Exception e) {
            Logger.error("Erro ao habilitar ColoredNames: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        Logger.info("ColoredNames mod disabled");
    }
}