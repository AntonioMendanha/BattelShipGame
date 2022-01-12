package com.services;

import com.entities.BoardPosition;
import com.utils.Converter;
import com.utils.Printer;
import com.utils.RandomNumber;
import com.utils.Scan;

public class HandleShip {

    private static final int TOTAL_SHIPS = 2 ;

    /**
     * Função para pocisionar os navios do player
     * */
    public static BoardPosition[][] setShipOnPlayerBoard(BoardPosition[][] playerBoard) {
        char rowLetter;

        for (int i = 0; i < TOTAL_SHIPS ; i++) {
            rowLetter = Scan.shipRowCoordinateScan();
            int row = Converter.letterToNumber(rowLetter);
            int column = Scan.shipColumnCoordinateScan();
            BoardPosition move = playerBoard[row][column];
            if (move.hasShipInside == false) {
                move.hasShipInside = true;
                move.boardType = SetBoardTypes.setShipInsideBoardSpace();
                System.out.println("Navio " + (i + 1) + " pocisionado!");
                Printer.nextRow();
            }
        }
        System.out.println("Aqui está o nosso mapa");
        GameBoard.printBoard(playerBoard);
        return playerBoard;
    }

    /**
     * Função criada para setar os navios do tabuleiro do NPC
     * */
    public static BoardPosition[][] setShipOnNpcBoard(BoardPosition[][] npcBoard) {
        for (int i = 0; i < TOTAL_SHIPS ; i++) {
            int row = RandomNumber.coordinates();
            int column = RandomNumber.coordinates();

            BoardPosition move = npcBoard[row][column];
            if (move.hasShipInside == false) {
                move.hasShipInside = true;
                move.boardType = SetBoardTypes.setShipInsideBoardSpace();
            }
        }
        Printer.nextRow();
        System.out.println("Navios inimigos pocisionados");
        System.out.println("Campo Adversário");
        GameBoard.printBoard(npcBoard);
        return npcBoard;
    }


}
