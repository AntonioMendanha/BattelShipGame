package com.entities;

import com.enums.BoardSpacesEnum;
import com.services.CreateBoard;
import com.utils.Printer;

public class GameBoard {

    private static final int MAX_COLUMN_ROW = 11;
    private static final String[] COL_HEADER_TEXT = {
            " _ ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J "
    };
    private static final String[] ROW_HEADER_TEXT = {
            " _ ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 10"

    };
    // Criando o esqueleto do campo 11x11
    private static BoardSpace[][] createGameBoard() {
        BoardSpace[][] gameBoard = new BoardSpace[MAX_COLUMN_ROW][MAX_COLUMN_ROW];
        for(int i = 0; i < MAX_COLUMN_ROW ; i++) {
            for(int j =0; j < MAX_COLUMN_ROW ; j++) {
                gameBoard[i][j] = BoardSpace.createBoardSpace();
            }
        }
        return gameBoard;
    }
    //Após criar o esqueleto, popular o tabuleiro com cada celula como um BoardSpace novo e insideText.EMPTY
    private static BoardSpace[][] newEmptyGameBoard(BoardSpace[][] gameBoard) {
        for (int i = 0; i < MAX_COLUMN_ROW ; i++){
            for (int j = 0; j < MAX_COLUMN_ROW ; j++){
                //formatar cabeçalho das linhas
                if(i == 0){
                    gameBoard[i][j].insideText = CreateBoard.formatInsideTextBoardSpace(j, ROW_HEADER_TEXT[j]);
                } else if (j == 0) {
                    gameBoard[i][j].insideText = CreateBoard.formatInsideTextBoardSpace(i, COL_HEADER_TEXT[i]);
                } else {
                    gameBoard[i][j].insideText = BoardSpacesEnum.EMPTY_CELL.getInsideText();
                }
            }
        }
        return gameBoard;
    }

    //Imprimir o tabuleiro
    public static void printBoard(){
        BoardSpace[][] createdGameBoard = createGameBoard();
        BoardSpace[][] newGameBoard = newEmptyGameBoard(createdGameBoard);

       for (int i = 0; i < MAX_COLUMN_ROW ; i++){
            for ( int j = 0; j < MAX_COLUMN_ROW ; j++) {
                Printer.boardSpacePrinter(newGameBoard[i][j]);
            }
            Printer.lineSeparator();
        }
    }

}