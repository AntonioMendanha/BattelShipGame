package com.entities;

public class GameStatus {

    public static boolean isGameOver = false;
    private int TOTAL_SHIPS_DESTROYED = 1;

    public static boolean getStatusGame(Player player, Player npc) {
        if (player.shipsDestroyed == 1) {
            isGameOver = true;
            System.out.println(player.name + " destruimos todos eles! Vencemos");
        }
        if (npc.shipsDestroyed == 1) {
            isGameOver = true;
            System.out.println(player.name + " Oh não, eles acabaram conosco!");
        }

        return isGameOver;
    }
}
