package com.digaoo.colorednames;

import com.digaoo.colorednames.api.HytalePlugin;
import com.digaoo.colorednames.api.HytaleCommandAPI;
import com.digaoo.colorednames.commands.CommandRegistrar;
import com.digaoo.colorednames.utils.Logger;

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

    /**
     * Define a API de comandos do Hytale
     */
    public void setCommandAPI(HytaleCommandAPI api) {
        CommandRegistrar.setCommandAPI(api);
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