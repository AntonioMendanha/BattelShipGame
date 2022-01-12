package com.services;

import com.enums.BoardSpacesEnum;

public class SetBoardTypes {

    //Formata o texto a ser inserido na célula do campo.
    public static String formatInsideTextBoardSpace(int counter,  String insideText){
        String result = "";
        //formata o cabeçalho das linhas e das colunas
        if (counter == 0){
            result =  insideText;
        } else {
            result = insideText;
        }
        return result;
    }
    // Insere o texto do navio na célula
    public static String setEmptyInsideBoardSpace(){
        return BoardSpacesEnum.EMPTY_CELL.setCellType();
    }
    public static String setShipInsideBoardSpace(){
        return BoardSpacesEnum.HAS_SHIP_INSIDE.setCellType();
    }
    public static String setWaterInsideBoardSpace(){
        return BoardSpacesEnum.HITTED_WATER.setCellType();
    }
    public static String setHittedShipInsideBoardSpace(){
        return BoardSpacesEnum.HITTED_SHIP.setCellType();
    }
}
