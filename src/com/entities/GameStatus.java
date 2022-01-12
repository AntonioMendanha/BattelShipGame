package com.entities;

public class GameStatus {

    public static boolean isGameOver = false;
    private static int TOTAL_SHIPS_DESTROYED = 2;

    public static boolean getStatusGame(Player player, Player npc) {
        if (player.shipsDestroyed == TOTAL_SHIPS_DESTROYED) {
            isGameOver = true;
            System.out.println(player.name + " destruimos todos eles! Vencemos");
        }
        if (npc.shipsDestroyed == TOTAL_SHIPS_DESTROYED) {
            isGameOver = true;
            System.out.println(player.name + " Oh não, eles acabaram conosco!");
        }

        return isGameOver;
    }
}
