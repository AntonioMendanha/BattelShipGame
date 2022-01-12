package com;

import com.entities.BoardPosition;
import com.entities.GameStatus;
import com.entities.Player;
import com.services.GameBoard;
import com.services.HandleShip;
import com.services.HandleShoot;
import com.utils.Printer;

public class Main {

    public static void main(String[] args) {

        /**
         * Inicialização do jogo com a criação dos tabuleiros
         * */
        Player player = Player.createPlayer();
        BoardPosition[][] playerBoard = GameBoard.createBoardGame();
        HandleShip.setShipOnPlayerBoard(playerBoard);

        Player npc = Player.createNPC();
        BoardPosition[][] npcBoard = GameBoard.createBoardGame();
        HandleShip.setShipOnNpcBoard(npcBoard);

        while (!GameStatus.isGameOver) {
            HandleShoot.shoot(player, npcBoard);
            GameStatus.getStatusGame(player, npc);
            if(!GameStatus.isGameOver) {
                HandleShoot.npcShoot(npc, playerBoard);
                GameStatus.getStatusGame(player, npc);
                Printer.gameStatus(player, npc);
            }
        }

        System.out.println("End of game");
    }
}
