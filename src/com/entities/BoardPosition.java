package com.entities;

import com.enums.BoardSpacesEnum;

/**
 * Classe criada para controlar cada célula do tabuleiro dentro do jogo
 * */
public class BoardPosition {
    public boolean isVisible = true;
    public boolean hasShipInside = false;
    public String boardType = " ";

    public BoardPosition(boolean isVisible, boolean hasShipInside, String insideText){
        this.isVisible = isVisible;
        this.hasShipInside = hasShipInside;
        this.boardType = insideText;
    }

    public static BoardPosition createBoardSpace() {
        BoardPosition boardPosition = new BoardPosition(true,false, " ");
        boardPosition.boardType = BoardSpacesEnum.EMPTY_CELL.setCellType();
        return boardPosition;
    }

    public static String setEmptyBoardSpace(BoardPosition boardPosition) {
        return boardPosition.boardType = BoardSpacesEnum.EMPTY_CELL.setCellType();
    }
}
