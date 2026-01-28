package com.digaoo.colorednames.api;

import com.digaoo.colorednames.data.ColorStorage;
import com.digaoo.colorednames.data.PlayerColorData;
import com.digaoo.colorednames.data.PlayerDataManager;

public class ColoredNamesAPI {

    public static void setColor(String playerName, String rank, String hexColor) {
        PlayerColorData data = PlayerDataManager.getOrCreate(playerName, rank);
        data.setColor(hexColor);
        ColorStorage.set(playerName, data);
    }

    public static void setGradient(String playerName, String rank, String gradientId) {
        PlayerColorData data = PlayerDataManager.getOrCreate(playerName, rank);
        data.setGradient(gradientId);
        ColorStorage.set(playerName, data);
    }

    public static PlayerColorData getData(String playerName) {
        return ColorStorage.get(playerName);
    }
}