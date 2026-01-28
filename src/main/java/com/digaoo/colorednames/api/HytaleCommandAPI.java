package com.digaoo.colorednames.api;

/**
 * Command API para Hytale - Interface para registrar e executar comandos
 */
public interface HytaleCommandAPI {
    void register(String command, HytaleCommandExecutor executor);
    void unregister(String command);
}
