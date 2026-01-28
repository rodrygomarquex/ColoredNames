package com.digaoo.colorednames.data;

/**
 * Stores player color information
 * Armazena informações de cor do jogador
 */
public class PlayerColorData {

    private String color;
    private String gradient;
    private String rank;

    public PlayerColorData(String rank) {
        this.rank = rank;
        this.color = null;
        this.gradient = null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        this.gradient = null;
    }

    public String getGradient() {
        return gradient;
    }

    public void setGradient(String gradient) {
        this.gradient = gradient;
        this.color = null;
    }

    public String getRank() {
        return rank;
    }
}