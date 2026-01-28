package com.digaoo.colorednames.commands;

/**
 * Command handler for /nomecor
 * Manipulador do comando /nomecor
 */
public class NameColorCommand {

    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Use /nomecor set <cor>");
            return;
        }

        if (args[0].equalsIgnoreCase("set")) {
            String color = args[1];
            System.out.println("Cor definida: " + color);
        }
    }
}