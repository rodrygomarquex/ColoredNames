package com.digaoo.colorednames.commands;

import com.digaoo.colorednames.api.HytaleCommandExecutor;
import com.digaoo.colorednames.data.ColorStorage;
import com.digaoo.colorednames.data.PlayerColorData;
import com.digaoo.colorednames.utils.Logger;

/**
 * Comando /colorname <cor_hex>
 * Define a cor do nome do jogador
 */
public class ColorNameCommand implements HytaleCommandExecutor {

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            Logger.info("Uso: /colorname <cor_hex>");
            Logger.info("Exemplo: /colorname FF0000 (vermelho)");
            return;
        }

        String playerName = args[0];
        String hexColor = args[1];

        // Validar formato de cor hex
        if (!isValidHexColor(hexColor)) {
            Logger.error("Cor inválida! Use formato: FF0000");
            return;
        }

        PlayerColorData data = ColorStorage.get(playerName);
        if (data == null) {
            data = new PlayerColorData(playerName, "DEFAULT");
        }

        data.setColor(hexColor);
        ColorStorage.set(playerName, data);

        Logger.info("Cor alterada para " + playerName + ": #" + hexColor);
    }

    private boolean isValidHexColor(String color) {
        return color.matches("^[0-9A-Fa-f]{6}$");
    }
}
