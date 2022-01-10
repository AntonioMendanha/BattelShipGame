package com.utils;

import com.entities.BoardSpace;

import java.util.Arrays;

public class Printer {

//    public static void gameBoardRow(BoardSpace[] cell) {
  //      System.out.println(Arrays.toString(cell));
    //}

    // Teste de mudança de texto na celula do tabuleiro
    public static void boardSpacePrinter(BoardSpace boardSpace){
        System.out.print("|" + boardSpace.boardType + "|");
    }

    public static void nextRow(){
        System.out.println("");
    }

    public static void rowShipCoordinate(){
        System.out.println("Vamos pocisionar o navio - Qual será a linha ? ");
        System.out.print("Insira um número entre 1 e 10: ");
    }
    public static void columnShipCoordinate(){
        Printer.nextRow();
        System.out.println("E em qual coluna esse navio vai ficar? ");
        System.out.print("Insira um número entre 1 e 10: ");
        Printer.nextRow();
    }
    public static void rowCoordinate() {
        Printer.nextRow();
        System.out.println("Certo Capitão, nossa vez de atirar, qual a linha que vamos atacar?");
        System.out.print("Insira um número entre 1 e 10: ");
    }
    public static void columnCoordinate() {
        System.out.println("Agora precisamos da coluna que vamos atacar?");
        System.out.print("Insira um número entre 1 e 10: ");
        Printer.nextRow();
    }
    public static void shootedOnShip(){
        Printer.nextRow();
        System.out.println("Belo tiro capitão, acertamos em cheio");
        Printer.nextRow();
    }
    public static void shootedOnWater(){
        Printer.nextRow();
        System.out.println("Essa não capitão, erramos o tiro");
        Printer.nextRow();
    }
    public static void repeatedCoordinates(){
        Printer.nextRow();
        System.out.println("Essas coordenadas já foram capitão, precisamos de outra...");
        Printer.nextRow();
    }
    public static void npcShootedOnShip() {
        Printer.nextRow();
        System.out.println("Perdemos um navio capitão!");
        Printer.nextRow();
    }
    public static void npcShootedOnWater() {
        Printer.nextRow();
        System.out.println("Eles erraram o tiro capitão, vamos em frente");
        Printer.nextRow();
    }
}
