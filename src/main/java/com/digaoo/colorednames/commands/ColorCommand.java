package com.digaoo.colorednames.commands;

import com.digaoo.colorednames.data.ColorStorage;
import com.digaoo.colorednames.data.PlayerColorData;

public class ColorCommand {

    public static void execute(String playerName, String hexColor) {
        PlayerColorData data = ColorStorage.get(playerName);

        if (data == null) {
            data = new PlayerColorData(playerName, "DEFAULT");
        }

        data.setColor(hexColor);
        ColorStorage.set(playerName, data);

        System.out.println("[ColoredNames] Cor definida para " + playerName);
    }
}