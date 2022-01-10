package com;

import com.entities.BoardSpace;
import com.entities.GameStatus;
import com.entities.Player;
import com.services.GameBoard;
import com.services.SetShip;
import com.services.SetShoot;

public class Main {

    public static void main(String[] args) {

        /**
         * Inicialização do jogo com a criação dos tabuleiros
         * */
        Player player = Player.createPlayer();
        BoardSpace[][] playerBoard = GameBoard.createBoardGame();
        SetShip.setShipOnPlayerBoard(playerBoard);

        Player npc = Player.createNPC();
        BoardSpace[][] npcBoard = GameBoard.createBoardGame();
        SetShip.setShipOnNpcBoard(npcBoard);

        if (!GameStatus.isGameOver) {
            SetShoot.shoot(player, npcBoard);
            GameStatus.getStatusGame(player, npc);
            SetShoot.npcShoot(npc, playerBoard);
            GameStatus.getStatusGame(player, npc);

            System.out.println("Player " + player.shipsDestroyed);
            System.out.println("NPC " + npc.shipsDestroyed);
        }

        System.out.println("End of game");
    }
}
