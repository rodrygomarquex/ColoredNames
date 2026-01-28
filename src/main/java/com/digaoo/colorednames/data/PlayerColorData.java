package com.digaoo.colorednames.data;

public class PlayerColorData {

    private String playerName;
    private String rank;
    private String color;
    private String gradient;

    public PlayerColorData(String playerName, String rank) {
        this.playerName = playerName;
        this.rank = rank;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getRank() {
        return rank;
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

    public boolean hasColor() {
        return color != null;
    }

    public boolean hasGradient() {
        return gradient != null;
    }
}