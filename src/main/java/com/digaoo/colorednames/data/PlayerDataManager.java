package com.digaoo.colorednames.data;

public class PlayerDataManager {

    public static PlayerColorData getOrCreate(String playerName, String rank) {
        PlayerColorData data = ColorStorage.get(playerName);

        if (data == null) {
            data = new PlayerColorData(playerName, rank);
            ColorStorage.set(playerName, data);
        }

        return data;
    }
}