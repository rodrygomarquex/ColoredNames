package com.digaoo.colorednames.commands;

import com.digaoo.colorednames.gui.GuiManager;

public class OpenColorGuiCommand {

    public void execute(String playerName) {
        GuiManager.openColorPicker(playerName);
    }
}