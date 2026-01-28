package com.digaoo.colorednames.api;

import com.digaoo.colorednames.data.PlayerColorData;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Public API for other mods
 * API pública para outros mods
 */
public class ColoredNamesAPI {

    private static final Map<UUID, PlayerColorData> dataMap = new HashMap<>();

    public static void setColor(UUID playerId, String color) {
        get(playerId).setColor(color);
    }

    public static void setGradient(UUID playerId, String gradient) {
        get(playerId).setGradient(gradient);
    }

    public static PlayerColorData get(UUID playerId) {
        return dataMap.computeIfAbsent(playerId, id -> new PlayerColorData("PLAYER"));
    }
}