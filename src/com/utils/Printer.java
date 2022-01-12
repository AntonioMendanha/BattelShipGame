package com.utils;

import com.entities.BoardPosition;
import com.entities.Player;

public class Printer {

    // Teste de mudança de texto na celula do tabuleiro
    public static void boardSpacePrinter(BoardPosition boardPosition){
        System.out.print("|" + boardPosition.boardType + "|");
    }

    public static void nextRow(){
        System.out.println("");
    }

    public static void setRowShipCoordinate(){
        System.out.print("Vamos pocisionar o navio - Linha A , B ou C ? ");
    }
    public static void setColumnShipCoordinate(){
        System.out.print("E em qual coluna esse navio vai ficar? Coluna 1, 2 ou 3 ? ");
        Printer.nextRow();
    }
    public static void rowCoordinate() {
        Printer.nextRow();
        System.out.print("Certo Capitão, nossa vez de atirar, qual a linha que vamos atacar? Linha A, B ou C? ");
    }
    public static void columnCoordinate() {
        System.out.println("Agora precisamos da coluna que vamos atacar? Coluna 1, 2 ou 3 ? ");
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

    public static void gameStatus(Player player, Player npc){
        Printer.nextRow();
        System.out.println("Game Status");
        System.out.println("Player " + player.shipsDestroyed);
        System.out.println("NPC " + npc.shipsDestroyed);
    }
}
