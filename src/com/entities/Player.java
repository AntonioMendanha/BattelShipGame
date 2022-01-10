package com.entities;

import com.utils.Scan;

/**
 * Classe criada para controlar o jogador e a pontuação do jogo
 * */
public class Player {
    public String name = "";
    public int shipsDestroyed = 0;
    //public BoardSpace[][] boardGame = new BoardSpace[11][11];

    public int setShipsDestroyed(){
        return this.shipsDestroyed++;
    }
    public static Player createPlayer() {
        Player player = new Player();
        player.name = Scan.nameScan();


        //BoardSpace[][] playerBoard = CreateGameBoard.createBoardGame();
        //SetShip.setShipOnPlayerBoard(playerBoard);

        return player;
    }
    public static Player createNPC(){
        Player npc = new Player();
        npc.name = "NPC";
        //BoardSpace[][] npcBoard = CreateGameBoard.createBoardGame();
        //SetShip.setShipOnNpcBoard(npcBoard);

        return npc;
    }
}
