package com;

import com.entities.BoardPosition;
import com.entities.GameStatus;
import com.entities.Player;
import com.services.GameBoard;
import com.services.HandleShip;
import com.services.HandleShoot;
import com.services.NewGame;
import com.utils.Printer;

public class Main {

    public static void main(String[] args) {

        /**
         * Inicialização dos jogadores
         * */
        Player player = Player.createPlayer();
        Player npc = Player.createNPC();

        /**
         * Inicialização dos tabuleiros
         * */
        BoardPosition[][] playerBoard = NewGame.createPlayerBoard();
        BoardPosition[][] npcBoard = NewGame.createNpcBoard();

        NewGame.startGame(player, npc, playerBoard, npcBoard);

        System.out.println("End of game");
    }
}
