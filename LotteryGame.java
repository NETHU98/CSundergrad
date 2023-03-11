package edu.gsu.csc1301.lotterygame;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



/**
 * @author nethmeeperera
 * @version 11/29/2021
 */
public class LotteryGame {
    static final int NUM_DIGITS = 5;
    public static void greetUser()
    {
        System.out.println("Welcome to the Lottery Game");

    }
    public static void main(String[] args) {

        greetUser();

        List<Integer> winningNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            while (true) {

                // select random numbers
                int winningNumber = random.nextInt(9) + 0;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }

        // print the random selected numbers


        Scanner scanner = new Scanner(System.in);

        // saving arraylist
        List<Integer> guessedNumbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter pick "+(i+1)+" (0 - 9): ");
            while (true) {
                try {
                    String numberString = scanner.nextLine();
                    int number = Integer.parseInt(numberString);
                    if (number >= 0 && number <= 9) {
                        guessedNumbers.add(number);
                        break;
                    }
                    else {
                        System.out.print("ERROR. Please enter a number (0 - 9): ");
                    }
                }

                // finding invalid numbers or errors
                catch (NumberFormatException nfe) {
                    System.out.print("ERROR. Please enter a number (0 - 9): ");
                }
            }
        }


        System.out.print("Lottery Number :");
        for (int element: winningNumbers) {

            System.out.print(" "+element+" ");
        }

        System.out.println();

        guessedNumbers.retainAll(winningNumbers);
        System.out.println("Number of matching digits : " + guessedNumbers.size());

        if (guessedNumbers.containsAll(winningNumbers)) {
            System.out.println("GRAND PRIZE WINNER!");
        }
        else {
            System.out.println("Sorry, you didn't win");
        }

        System.exit(0);
    }
}