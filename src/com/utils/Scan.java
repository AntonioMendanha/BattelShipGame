package com.utils;

import java.util.Scanner;

public class Scan {

    public static String nameScan(){
        Scanner playerName = new Scanner(System.in);
        System.out.print("Insira o seu nome Capitão: ");
        return playerName.next();
    }
    public static int chooseColumn() {
        Scanner columnScan = new Scanner(System.in);
        System.out.print("Insira o numero da coluna: ");
        return columnScan.nextInt();
    }
    public static String chooseRow() {
        Scanner rowScan = new Scanner(System.in);
        System.out.print("Insira a letra da linha: ");
        return rowScan.next();
    }

    public static int rowCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.rowCoordinate();
        return number.nextInt();
    }

    public static int columnCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.columnCoordinate();
        return number.nextInt();
    }

    public static int shipRowCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.rowShipCoordinate();
        return number.nextInt();
    }

    public static int shipColumnCoordinateScan() {
        Scanner number = new Scanner(System.in);
        Printer.columnShipCoordinate();
        return number.nextInt();
    }




}
