package com.dicegame.dicegame;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Randomnumbergenerator {

    int devOne;
    int devTwo;
    int devThree;
    int devFour;
    int devFive;
    int devSix;
    int devOneMove;
    int devTwoMove;
    int devThreeMove;
    int devFourMove;
    int devFiveMove;
    int devSixMove;
    int runningTotal;
    int runningTotalAvaible;
    double efficiency;

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

    public ArrayList<Integer> moveRoll() {
        ArrayList<Integer> devs = new ArrayList<>();
        devs.add(devOneMove = 0);
        devs.add(devTwoMove = devTwo + devOne - devTwo);
        devs.add(devThreeMove = devThree + devTwo - devThree);
        devs.add(devFourMove = devFour + devThree - devFour);
        devs.add(devFiveMove = devFive + devFour - devFive);
        devs.add(devSixMove = devSix + devFour - devSix);
        return devs;
    }

    public int diceRoll() {
        return (ThreadLocalRandom.current().nextInt(1, 7));
    }

    public int runningTotalCount() {
        runningTotal = runningTotal + devOne + devTwo + devThree + devFour + devFive + devSix;
        return runningTotal;
    }

    public int runningTotalAvailable() {
        runningTotalAvaible = 36;
        return runningTotalAvaible;
    }

    public double efficiencyPercent() {
        DecimalFormat df = new DecimalFormat("#.00"); //NEED TO USE THIS STILL
        efficiency = ((double) runningTotal / runningTotalAvaible);
        return efficiency;
    }
}