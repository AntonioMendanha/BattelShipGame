package com.services;

import com.controllers.HandleShip;
import com.controllers.HandleShoot;
import com.entities.BoardPosition;
import com.entities.GameStatus;
import com.entities.Player;
import com.utils.Printer;

public class NewGame {


    public static BoardPosition[][] createPlayerBoard(){
        BoardPosition[][] playerBoard = GameBoard.createBoardGame();
        HandleShip.setShipOnPlayerBoard(playerBoard);
        return playerBoard;
    }

    public static BoardPosition[][] createNpcBoard() {
        BoardPosition[][] npcBoard = GameBoard.createBoardGame();
        HandleShip.setShipOnNpcBoard(npcBoard);
        return npcBoard;
    }

    public static void startGame(Player player, Player npc, BoardPosition[][] playerBoard, BoardPosition[][] npcBoard){
        while (!GameStatus.isGameOver) {
            HandleShoot.shoot(player, npcBoard);
            GameStatus.getStatusGame(player, npc);
            System.out.println("Tabuleiro Inimigo");
            GameBoard.printBoard(npcBoard);
            if(!GameStatus.isGameOver) {
                HandleShoot.npcShoot(npc, playerBoard);
                GameStatus.getStatusGame(player, npc);
                Printer.gameStatus(player, npc);
                System.out.println("Nosso tabuleiro");
                GameBoard.printBoard(playerBoard);
            }
        }
    }
}
