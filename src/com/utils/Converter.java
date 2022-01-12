package com.utils;

public class Converter {

    public static int letterToNumber (char letter) {
        switch (letter) {
            case 'A': return 1;
            case 'a': return 1;
            case 'B': return 2;
            case 'b': return 2;
            case 'C': return 3;
            case 'c': return 3;
            case 'D': return 4;
            case 'd': return 4;
            case 'E': return 5;
            case 'e': return 5;
            case 'F': return 6;
            case 'f': return 6;
            case 'G': return 7;
            case 'g': return 7;
            case 'H': return 8;
            case 'h': return 8;
            case 'I': return 9;
            case 'i': return 9;
            case 'J': return 10;
            case 'j': return 10;
        }
        return 333;
    }
}
