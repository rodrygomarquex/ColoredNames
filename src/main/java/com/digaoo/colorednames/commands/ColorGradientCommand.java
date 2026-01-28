package com.digaoo.colorednames.commands;

import com.digaoo.colorednames.api.HytaleCommandExecutor;
import com.digaoo.colorednames.data.ColorStorage;
import com.digaoo.colorednames.data.PlayerColorData;
import com.digaoo.colorednames.utils.Logger;

/**
 * Comando /colorgradient <gradientId>
 * Define o gradiente do nome do jogador
 */
public class ColorGradientCommand implements HytaleCommandExecutor {

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            Logger.info("Uso: /colorgradient <playerName> <gradientId>");
            Logger.info("Gradientes disponíveis: rainbow, fire, ice, sunset");
            return;
        }

        String playerName = args[0];
        String gradientId = args[1];

        PlayerColorData data = ColorStorage.get(playerName);
        if (data == null) {
            data = new PlayerColorData(playerName, "DEFAULT");
        }

        data.setGradient(gradientId);
        ColorStorage.set(playerName, data);

        Logger.info("Gradiente alterado para " + playerName + ": " + gradientId);
    }
}
