package com.digaoo.colorednames.data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Player data manager
 * Gerenciador de dados dos jogadores
 */
public class PlayerDataManager {

    private static final Map<UUID, PlayerColorData> players = new HashMap<>();

    public static PlayerColorData get(UUID uuid) {
        return players.computeIfAbsent(uuid, id -> new PlayerColorData("PLAYER"));
    }
}