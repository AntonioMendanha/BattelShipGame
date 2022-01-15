package com.controllers;

import com.enums.BoardTypesEnum;

public class HandleBoardTypes {

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
        return BoardTypesEnum.EMPTY_CELL.setCellType();
    }
    public static String setShipInsideBoardSpace(){
        return BoardTypesEnum.HAS_SHIP_INSIDE.setCellType();
    }
    public static String setWaterInsideBoardSpace(){
        return BoardTypesEnum.HITTED_WATER.setCellType();
    }
    public static String setHittedShipInsideBoardSpace(){
        return BoardTypesEnum.HITTED_SHIP.setCellType();
    }
}
