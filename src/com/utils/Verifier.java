package com.utils;

public class Verifier {


    public static char rowShipVerifier(char row) {
        char result = row;
        boolean isValid = false;
        while (!isValid) {
            if ( result == 'A' || result == 'B' || result == 'C'){
                isValid = true;
                return result;
            } else {
                result = Scan.shipRowCoordinateScan();
            }
        }
        return result;
    }
    public static char rowShootVerifier(char row) {
        char result = row;
        boolean isValid = false;
        while (!isValid) {
            if (result == 'A' || result == 'B' || result == 'C'){
                isValid = true;
                return result;
            } else {
                result = Scan.shootRowCoordinateScan();
            }
        }
        return result;
    }

    public static int numberVerifier(int column ){
        int result = column;
        boolean isValid = false;
        while (!isValid) {
            if ( result > 0  && result < 4) {
                isValid = true;
                return result;
            } else {
                result = Scan.shootColumnCoordinateScan();
            }
        }
        return result;
    }

}
