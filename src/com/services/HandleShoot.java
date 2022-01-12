package com.services;

import com.entities.BoardPosition;
import com.entities.Player;
import com.utils.Converter;
import com.utils.Printer;
import com.utils.RandomNumber;
import com.utils.Scan;

public class HandleShoot {

    /**
     * Função para criar o tiro do player no NPC
     * */
    public static BoardPosition[][] shoot(Player player, BoardPosition[][] npcBoard) {
        char rowLetter;
        rowLetter = Scan.rowCoordinateScan();
        int row = Converter.letterToNumber(rowLetter);
        int column = Scan.columnCoordinateScan();
        BoardPosition shoot = npcBoard[row][column];
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
    public static BoardPosition[][] npcShoot(Player npc, BoardPosition[][] playerBoard) {
        int row = RandomNumber.coordinates();
        int column = RandomNumber.coordinates();
        BoardPosition shoot = playerBoard[row][column];
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
