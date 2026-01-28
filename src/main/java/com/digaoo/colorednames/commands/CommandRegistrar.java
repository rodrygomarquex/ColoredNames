package com.digaoo.colorednames.commands;

import com.digaoo.colorednames.api.HytaleCommandAPI;
import com.digaoo.colorednames.utils.Logger;

public class CommandRegistrar {

    private static HytaleCommandAPI commandAPI;

    public static void setCommandAPI(HytaleCommandAPI api) {
        commandAPI = api;
    }

    public static void registerAll() {
        Logger.info("Registrando comandos...");
        
        if (commandAPI == null) {
            Logger.warn("CommandAPI não disponível - comandos não serão registrados");
            Logger.info("Você pode registrar comandos manualmente:");
            Logger.info("  /colorname <cor_hex> - Define cor do nome");
            Logger.info("  /colorgradient <gradientId> - Define gradiente");
            return;
        }

        try {
            commandAPI.register("colorname", new ColorNameCommand());
            Logger.info("Comando /colorname registrado");

            commandAPI.register("colorgradient", new ColorGradientCommand());
            Logger.info("Comando /colorgradient registrado");

        } catch (Exception e) {
            Logger.error("Erro ao registrar comandos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}