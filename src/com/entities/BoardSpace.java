package com.entities;

import com.enums.BoardSpacesEnum;

/**
 * Classe criada para controlar cada célula do tabuleiro dentro do jogo
 * */
public class BoardSpace {
    public boolean isVisible = true;
    public boolean hasShipInside = false;
    public String insideText = " ";

    public BoardSpace(boolean isVisible, boolean hasShipInside, String insideText){
        this.isVisible = isVisible;
        this.hasShipInside = hasShipInside;
        this.insideText = insideText;
    }

    public static BoardSpace createBoardSpace() {
        BoardSpace boardSpace = new BoardSpace(true,false, " ");
        boardSpace.insideText = BoardSpacesEnum.EMPTY_CELL.getInsideText();
        return boardSpace;
    }

    public static String setEmptyBoardSpace(BoardSpace boardSpace) {
        return boardSpace.insideText = BoardSpacesEnum.EMPTY_CELL.getInsideText();
    }

    public static BoardSpace setShipInside(BoardSpace boardSpace) {
        boardSpace.hasShipInside = true;
        boardSpace.insideText = BoardSpacesEnum.HAS_SHIP_INSIDE.getInsideText();
        return boardSpace;
    }
    public static BoardSpace setHittedShip(BoardSpace boardSpace) {
        boardSpace.hasShipInside = true;
        boardSpace.insideText = BoardSpacesEnum.HITTED_SHIP.getInsideText();
        return boardSpace;
    }
    public static BoardSpace setHittedWater(BoardSpace boardSpace) {
        boardSpace.insideText = BoardSpacesEnum.HITTED_WATER.getInsideText();
        return boardSpace;
    }

}
