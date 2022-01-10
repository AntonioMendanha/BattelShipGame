package com.utils;

import java.util.Random;

public class RandomNumber {

    public static int coordinates(){
        Random randomNumber = new Random();
         int result = randomNumber.nextInt(10) + 1;
        return result;
    }
}
