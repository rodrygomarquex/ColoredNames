package com.digaoo.colorednames.api;

/**
 * Minimal plugin lifecycle for Hytale-compatible plugins.
 * The server's plugin loader should invoke these methods.
 */
public interface HytalePlugin {
    void onLoad();
    void onEnable();
    void onDisable();
}
