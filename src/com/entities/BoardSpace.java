package com.entities;

import com.enums.BoardSpacesEnum;

/**
 * Classe criada para controlar cada célula do tabuleiro dentro do jogo
 * */
public class BoardSpace {
    public boolean isVisible = true;
    public boolean hasShipInside = false;
    public String boardType = " ";

    public BoardSpace(boolean isVisible, boolean hasShipInside, String insideText){
        this.isVisible = isVisible;
        this.hasShipInside = hasShipInside;
        this.boardType = insideText;
    }

    public static BoardSpace createBoardSpace() {
        BoardSpace boardSpace = new BoardSpace(true,false, " ");
        boardSpace.boardType = BoardSpacesEnum.EMPTY_CELL.setCellType();
        return boardSpace;
    }

    public static String setEmptyBoardSpace(BoardSpace boardSpace) {
        return boardSpace.boardType = BoardSpacesEnum.EMPTY_CELL.setCellType();
    }
}
