package com.services;

import com.entities.BoardPosition;
import com.utils.*;

public class HandleShip {

    private static final int TOTAL_SHIPS = 2 ;
    private static int column = 0;
    private static int row = 0;

    /**
     * Função para pocisionar os navios do player, utiliza os verificadores para validação
     * */
    public static BoardPosition[][] setShipOnPlayerBoard(BoardPosition[][] playerBoard) {
        for (int i = 0; i < TOTAL_SHIPS ; i++) {

            int[] moveNumber = getPlayerMove();
            BoardPosition move = playerBoard[moveNumber[0]][moveNumber[1]];

            if (!move.hasShipInside) {
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
            int[] moveNumber = getNpcMove();

            BoardPosition move = npcBoard[moveNumber[0]][moveNumber[1]];

            if (!move.hasShipInside) {
                move.hasShipInside = true;
            }
        }
        Printer.nextRow();
        System.out.println("Navios inimigos pocisionados");
        System.out.println("Campo Adversário");
        GameBoard.printBoard(npcBoard);
        return npcBoard;
    }

    public static int[] getPlayerMove(){
        char letterRow = Verifier.rowShipVerifier(Scan.shipRowCoordinateScan());
        row = Converter.letterToNumber(letterRow);
        column = Verifier.numberVerifier(Scan.shipColumnCoordinateScan());
        int[] result = { row , column };
        return result;
    }

    public static int[] getNpcMove(){
        row = Verifier.numberVerifier(RandomNumber.coordinates());
        column = Verifier.numberVerifier(RandomNumber.coordinates());
        int[] result = { row , column};
        return result;
    }

}
