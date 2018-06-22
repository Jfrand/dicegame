package com.dicegame.dicegame;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Randomnumbergenerator {

    int devOne;
    int devTwo;
    int devThree;
    int devFour;
    int devFive;
    int devSix;

    public ArrayList<Integer> storeRoll() {
        ArrayList<Integer> devs = new ArrayList<>();
        devs.add(devOne = diceRoll());
        devs.add(devTwo = diceRoll());
        devs.add(devThree = diceRoll());
        devs.add(devFour = diceRoll());
        devs.add(devFive = diceRoll());
        devs.add(devSix = diceRoll());
        return devs;
    }

    public int diceRoll() {
        return (ThreadLocalRandom.current().nextInt(1, 7));
    }


    public void bottleNeck(){
        for (int i = 0; i < 30; i++)
            return;
    }
}