package com.digaoo.colorednames.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ColorStorage {

    private static final File DATA_FOLDER = new File("data/colorednames");
    private static final File DATA_FILE = new File(DATA_FOLDER, "players.json");

    private static final Gson GSON = new Gson();
    private static Map<String, PlayerColorData> DATA = new HashMap<>();

    static {
        load();
    }

    public static void set(String playerName, PlayerColorData data) {
        DATA.put(playerName, data);
        save();
    }

    public static PlayerColorData get(String playerName) {
        return DATA.get(playerName);
    }

    private static void load() {
        try {
            if (!DATA_FILE.exists()) {
                DATA_FOLDER.mkdirs();
                save();
                return;
            }

            Type type = new TypeToken<Map<String, PlayerColorData>>() {}.getType();
            DATA = GSON.fromJson(new FileReader(DATA_FILE), type);

            if (DATA == null) {
                DATA = new HashMap<>();
            }

        } catch (Exception e) {
            e.printStackTrace();
            DATA = new HashMap<>();
        }
    }

    private static void save() {
        try (FileWriter writer = new FileWriter(DATA_FILE)) {
            GSON.toJson(DATA, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}