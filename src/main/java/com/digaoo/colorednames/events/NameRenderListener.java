package com.digaoo.colorednames.events;

/**
 * Name render listener
 * Evento de renderização do nome do jogador
 */
public class NameRenderListener {

    public String onRenderName(String originalName, String styledName) {
        return styledName != null ? styledName : originalName;
    }
}