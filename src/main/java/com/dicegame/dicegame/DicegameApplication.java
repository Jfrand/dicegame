package com.dicegame.dicegame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DicegameApplication {

    public static void main(String[] args) {

        Randomnumbergenerator rand = new Randomnumbergenerator();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Press enter to roll. \n");
                String input = scanner.nextLine();

                if ("".equals(input)) {
                    rand.storeRoll();
                    System.out.println("Dev One: " + rand.devOne);
                    System.out.println("Dev Two: " + rand.devTwo);
                    System.out.println("Dev Three: " + rand.devThree);
                    System.out.println("Dev Four: " + rand.devFour);
                    System.out.println("Dev Five: " + rand.devFive);
                    System.out.println("Dev Six: " + rand.devSix);
                    break;
                }
                System.out.println("Not the sharpest tool in the shed I see.\n");
            }
            while (true) {
                System.out.println("\nPress enter again to move values to the next dev. ");
                String input = scanner.nextLine();

                if ("".equals(input)) {
                    rand.moveRoll();
                    System.out.println("Dev One: " + rand.devOneMove);
                    System.out.println("Dev Two: " + rand.devTwoMove);
                    System.out.println("Dev Three: " + rand.devThreeMove);
                    System.out.println("Dev Four: " + rand.devFourMove);
                    System.out.println("Dev Five: " + rand.devFiveMove);
                    System.out.println("Dev Six: " + rand.devSixMove);
                    break;
                }
                System.out.println("Not the sharpest tool in the shed I see.\n");
            }
            rand.runningTotalCount();
            System.out.println("\nRunning total count rolled = " + rand.runningTotal);
            rand.runningTotalAvailable();
            System.out.println("\nRunning total available = " + rand.runningTotalAvaible);
            rand.efficiencyPercent();
            System.out.println("\nEfficiency percentage = " + rand.efficiency);
        }

//        boolean count;
//        while (count = rand.storeRoll().toArray().length < 50) {
//            rand.storeRoll();
//            System.out.println("Dev One: " + rand.devOne);
//            System.out.println("Dev Two: " + rand.devTwo);
//            System.out.println("Dev Three: " + rand.devThree);
//            System.out.println("Dev Four: " + rand.devFour);
//            System.out.println("Dev Five: " + rand.devFive);
//            System.out.println("Dev Six: " + rand.devSix);
//      }
    }
}


