package com.controllers;

import com.entities.BoardPosition;
import com.entities.Player;
import com.utils.*;

public class HandleShoot {
    private static int column = 0;
    private static int row = 0;

    /**
     * Função para criar o tiro do player no NPC
     * */
    public static BoardPosition[][] shoot(Player player, BoardPosition[][] npcBoard) {
        char rowLetter = Verifier.rowShootVerifier(Scan.shootRowCoordinateScan());
        row = Converter.letterToNumber(rowLetter);
        column = Verifier.numberVerifier(Scan.shootColumnCoordinateScan());
        BoardPosition shoot = npcBoard[row][column];
        if (shoot.hasShipInside == true) {
            Printer.shootedOnShip();
            shoot.boardType = HandleBoardTypes.setHittedShipInsideBoardSpace();
            player.setShipsDestroyed();
        } else {
            Printer.shootedOnWater();
            shoot.boardType = HandleBoardTypes.setWaterInsideBoardSpace();
        }
        System.out.println("Campo inimigo atualizado");

        return npcBoard;
    }

    /**
     * Função para criar o tiro do NPC
     * */
    public static BoardPosition[][] npcShoot(Player npc, BoardPosition[][] playerBoard) {
        row = Verifier.numberVerifier(RandomNumber.coordinates()); // ja funciona com int
        column = Verifier.numberVerifier(RandomNumber.coordinates());
        BoardPosition shoot = playerBoard[row][column];
        if (shoot.hasShipInside == true) {
            Printer.npcShootedOnShip();
            shoot.boardType = HandleBoardTypes.setHittedShipInsideBoardSpace();
            npc.setShipsDestroyed();
        } else {
            Printer.npcShootedOnWater();
            shoot.boardType = HandleBoardTypes.setWaterInsideBoardSpace();
        }


        return playerBoard;
    }

}
