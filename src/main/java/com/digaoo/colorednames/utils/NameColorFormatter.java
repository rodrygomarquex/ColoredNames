package com.digaoo.colorednames.utils;

import com.digaoo.colorednames.data.PlayerColorData;

public class NameColorFormatter {

    public static String format(String playerName, PlayerColorData data) {

        if (data == null) return playerName;

        if (data.getColor() != null) {
            return data.getColor() + playerName;
        }

        if (data.getGradient() != null) {
            return "[GRADIENT:" + data.getGradient() + "]" + playerName;
        }

        return playerName;
    }
}