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
        }
        return 333;
    }
}
