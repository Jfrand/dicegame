package com.dicegame.dicegame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class DicegameApplication {

    public static void main(String[] args) {

        Randomnumbergenerator rand = new Randomnumbergenerator();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Press enter to roll. ");
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


