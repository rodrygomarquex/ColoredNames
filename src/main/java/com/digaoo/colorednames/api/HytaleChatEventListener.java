package com.digaoo.colorednames.api;

/**
 * Chat Event API para Hytale
 */
public interface HytaleChatEventListener {
    void onChatMessage(String playerName, String message);
}
