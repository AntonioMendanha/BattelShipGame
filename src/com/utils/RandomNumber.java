package com.utils;

import com.services.GameBoard;

import java.util.Random;

public class RandomNumber {

    private static final int MAX_NUMBER = GameBoard.MAX_COLUMN_ROW;

    public static int coordinates(){
        Random randomNumber = new Random();
        int result = randomNumber.nextInt(MAX_NUMBER);
        while (result == 0 || result == 4 )
         result = randomNumber.nextInt(MAX_NUMBER);
        return result;
    }
}
