package com.services;

import com.entities.BoardSpace;
import com.utils.Printer;
import com.utils.RandomNumber;
import com.utils.Scan;

public class SetShip {

    private static final int TOTAL_SHIPS = 2 ;

    /**
     * Função para pocisionar os navios do player
     * */
    public static BoardSpace[][] setShipOnPlayerBoard(BoardSpace[][] playerBoard) {
        for (int i = 0; i < TOTAL_SHIPS ; i++) {
            int row = Scan.shipRowCoordinateScan();
            int column = Scan.shipColumnCoordinateScan();
            BoardSpace move = playerBoard[row][column];
            if (move.hasShipInside == false) {
                move.hasShipInside = true;
                move.boardType = SetBoardTypes.setShipInsideBoardSpace();
                System.out.println("Navio " + (i + 1) + " pocisionado!");
                Printer.nextRow();
            }
                //move.isVisible = false; verificar se é necessário ou se exclui a linha acima
            }
        System.out.println("Aqui está o nosso mapa");
        GameBoard.printBoard(playerBoard);
        return playerBoard;
    }

    /**
     * Função criada para setar os navios do tabuleiro do NPC
     * */
    public static BoardSpace[][] setShipOnNpcBoard(BoardSpace[][] npcBoard) {
        for (int i = 0; i < TOTAL_SHIPS ; i++) {
            //Random random = new Random();
            //int row = random.nextInt(10) + 1;
            //int column = random.nextInt(10) + 1;
            int row = RandomNumber.coordinates();
            int column = RandomNumber.coordinates();

            BoardSpace move = npcBoard[row][column];
            if (move.hasShipInside == false) {
                move.hasShipInside = true;
                move.boardType = SetBoardTypes.setShipInsideBoardSpace();
                System.out.println("Navio " + (i + 1) + " pocisionado!");
                Printer.nextRow();
            }
            //move.isVisible = false; verificar se é necessário ou se exclui a linha acima
        }
        System.out.println("Campo Adversário");
        GameBoard.printBoard(npcBoard);
        return npcBoard;
    }


}
