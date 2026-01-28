package com.digaoo.colorednames.events;

import com.digaoo.colorednames.commands.CommandRegistrar;
import com.digaoo.colorednames.utils.Logger;

public class EventRegistrar {

    public static void register() {
        Logger.info("Registrando eventos...");
        try {
            CommandRegistrar.registerAll();
            Logger.info("Eventos registrados com sucesso");
        } catch (Exception e) {
            Logger.error("Erro ao registrar eventos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}