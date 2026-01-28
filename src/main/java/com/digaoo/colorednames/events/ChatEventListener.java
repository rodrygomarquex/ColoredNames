package com.digaoo.colorednames.events;

/**
 * Chat event listener
 * Listener de evento de chat
 */
public class ChatEventListener {

    public void onChat(String playerName, String message) {
        System.out.println(playerName + ": " + message);
    }
}