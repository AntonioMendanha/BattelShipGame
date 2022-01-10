package com.services;

import com.entities.BoardSpace;
import com.entities.Player;
import com.utils.Printer;
import com.utils.RandomNumber;
import com.utils.Scan;

public class SetShoot {

    /**
     * Função para criar o tiro do player no NPC
     * */
    public static BoardSpace[][] shoot(Player player,  BoardSpace[][] npcBoard) {
        int row = Scan.rowCoordinateScan();
        int column = Scan.columnCoordinateScan();
        BoardSpace shoot = npcBoard[row][column];
        if (shoot.hasShipInside == true) {
            Printer.shootedOnShip();
            shoot.boardType = SetBoardTypes.setHittedShipInsideBoardSpace();
            player.setShipsDestroyed();
        } else {
            Printer.shootedOnWater();
            shoot.boardType = SetBoardTypes.setWaterInsideBoardSpace();
        }
        GameBoard.printBoard(npcBoard);

        return npcBoard;
    }

    /**
     * Função para criar o tiro do NPC
     * */
    public static BoardSpace[][] npcShoot(Player npc,  BoardSpace[][] playerBoard) {
        int row = RandomNumber.coordinates();
        int column = RandomNumber.coordinates();
        BoardSpace shoot = playerBoard[row][column];
        if (shoot.hasShipInside == true) {
            Printer.npcShootedOnShip();
            shoot.boardType = SetBoardTypes.setHittedShipInsideBoardSpace();
            npc.setShipsDestroyed();
        } else {
            Printer.npcShootedOnWater();
            shoot.boardType = SetBoardTypes.setWaterInsideBoardSpace();
        }
        GameBoard.printBoard(playerBoard);

        return playerBoard;
    }

}
