package com.services;

import com.entities.BoardSpace;
import com.utils.Printer;

public class GameBoard {

    private static final int MAX_COLUMN_ROW = 11;
    private static final String[] COL_HEADER_TEXT = {
            " _ ", " A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J "
    };
    private static final String[] ROW_HEADER_TEXT = {
            " _ ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 10"
    };
    private static final int maxShipOnBoard = 3;

    /**
     * Função para criar o esqueleto do tabuleiro de células do jogo em tamanho 11 x 11
     * */
    private static BoardSpace[][] initializeGameBoard() {
        BoardSpace[][] gameBoard = new BoardSpace[MAX_COLUMN_ROW][MAX_COLUMN_ROW];
        for(int i = 0; i < MAX_COLUMN_ROW ; i++) {
            for(int j =0; j < MAX_COLUMN_ROW ; j++) {
                gameBoard[i][j] = BoardSpace.createBoardSpace();
            }
        }
        return gameBoard;
    }

    /**
     * Função que recebe o esqueleto do tabuleiro e coloca todas as células com o campo vazio
     * */
    //Após criar o esqueleto, popular o tabuleiro com cada celula como um BoardSpace novo e insideText.EMPTY
    private static BoardSpace[][] newEmptyGameBoard(BoardSpace[][] gameBoard) {
        for (int i = 0; i < MAX_COLUMN_ROW ; i++){
            for (int j = 0; j < MAX_COLUMN_ROW ; j++){
                //formatar cabeçalho das linhas
                if(i == 0){
                    gameBoard[i][j].boardType = SetBoardTypes.formatInsideTextBoardSpace(j, ROW_HEADER_TEXT[j]);
                } else if (j == 0) {
                    gameBoard[i][j].boardType = SetBoardTypes.formatInsideTextBoardSpace(i, COL_HEADER_TEXT[i]);
                } else {
                    gameBoard[i][j].boardType = SetBoardTypes.setEmptyInsideBoardSpace();
                }
            }
        }
        return gameBoard;
    }

    /**
     * Cria um tabuleiro 11 pronto para ser exibido em tela
     */
    public static BoardSpace[][] createBoardGame() {
        BoardSpace[][] initializeGameBoard = initializeGameBoard();
        BoardSpace[][] newGameBoard = newEmptyGameBoard(initializeGameBoard);
        return newGameBoard;
    }

    /**
     * Função para imprimir o tabuleiro
     */
    //Imprimir o tabuleiro na tela (player ou npc)
    public static void printBoard(BoardSpace[][] board){
       for (int i = 0; i < MAX_COLUMN_ROW ; i++){
            for ( int j = 0; j < MAX_COLUMN_ROW ; j++) {
                Printer.boardSpacePrinter(board[i][j]);
            }
            Printer.nextRow();
        }
    }

}