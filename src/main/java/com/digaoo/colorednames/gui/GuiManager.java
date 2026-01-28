package com.digaoo.colorednames.gui;

public class GuiManager {

    public static void openColorPicker(String playerName) {
        System.out.println("[ColoredNames] Abrindo GUI de cores para " + playerName);

        ColorPickerGui.open(playerName);
    }
}