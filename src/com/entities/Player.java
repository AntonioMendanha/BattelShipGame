package com.entities;

import com.utils.Scan;

/**
 * Classe criada para controlar o jogador e a pontuação do jogo
 * */
public class Player {
    public String name = "";
    public static final String NPC_NAME = "NPC";
    public int shipsDestroyed = 0;


    public int setShipsDestroyed(){
        return this.shipsDestroyed++;
    }
    public static Player createPlayer() {
        Player player = new Player();
        player.name = Scan.nameScan();

        return player;
    }
    public static Player createNPC(){
        Player npc = new Player();
        npc.name = NPC_NAME;

        return npc;
    }
}
