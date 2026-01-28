package com.digaoo.colorednames.rank;

/**
 * Rank manager
 * Gerenciador de ranks
 */
public class RankManager {

    public static int getMaxColors(RankType rank) {
        return switch (rank) {
            case PLAYER -> 5;
            case VIP -> 10;
            case OPERATOR -> 1;
            case ADMIN -> 1;
        };
    }
}