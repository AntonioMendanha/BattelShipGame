package com.utils;

import com.entities.BoardSpace;

import java.util.Arrays;

public class Printer {

    public static void boardStatus(){
        System.out.println("Printer works");
    }

    public static void gameBoardRow(BoardSpace[] cell) {
        System.out.println(Arrays.toString(cell));
    }

    // Teste de mudança de texto na celula do tabuleiro
    public static void boardSpacePrinter(BoardSpace boardSpace){
        System.out.print("|" + boardSpace.insideText + "|");
    }

    public static void lineSeparator(){
        System.out.println("");
    }



}
