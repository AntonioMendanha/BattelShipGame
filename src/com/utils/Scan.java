package com.utils;

import java.util.Scanner;

public class Scan {

    public static String nameScan(){
        Scanner playerName = new Scanner(System.in);
        System.out.print("Insira o seu nome Capitão: ");
        return playerName.next();
    }

    public static char shootRowCoordinateScan() {
        Scanner letter = new Scanner(System.in);
        Printer.rowCoordinate();
        char result = Character.toUpperCase(letter.next().charAt(0));
        return result;
    }

    public static int shootColumnCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.columnCoordinate();
        return number.nextInt();
    }

    public static char shipRowCoordinateScan() {
        Scanner letter = new Scanner(System.in);
        Printer.setRowShipCoordinate();
        char result = Character.toUpperCase(letter.next().charAt(0));
        return result;
    }

    public static int shipColumnCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.setColumnShipCoordinate();
        return number.nextInt();
    }

}
