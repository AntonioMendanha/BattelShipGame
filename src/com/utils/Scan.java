package com.utils;

import java.util.Scanner;

public class Scan {

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

}
