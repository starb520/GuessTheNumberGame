import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

        public static void main (String[] args){
            // create an object to use the RandomNumber class attributes and methods
            RandomNumber rNum = new RandomNumber();

            // call the RandomNumber class method generateRandomNumber
            int aRandomNumber = rNum.generateRandomNumber();

            // create an arrayList to hold user guesses, a dynamic data structure in Java
            ArrayList<Integer> userGuesses = new ArrayList<>();

            // print out random number to make sure method is working
             System.out.println(aRandomNumber);

            // create scanner object for user input
            Scanner inputObj = new Scanner(System.in);

            boolean continuePlay = true;
            while (continuePlay) {

                // call RandomNumber method to prompt user for a number between 1 and 100
                int uNum = rNum.getUserNumber();

                // add user's guess to the array of userGuesses
                userGuesses.add(uNum);

                if (rNum.checkForMatch(uNum)) {
                    System.out.println("You got it!");

                    // print out the numbers a user guessed
                    System.out.println("It took you " + userGuesses.size() + " guess[es]");

                    // prompt user if he/she would like to play again
                    System.out.println("Would you like to play again? [y/n]");
                    String userInput = inputObj.nextLine();
                    // System.out.println(userInput.getClass().getName());  // Trying to fix a bug with if statement

                    if (userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("Y")) {
                        // call the RandomNumber class method generateRandomNumber a new random number
                        aRandomNumber = rNum.generateRandomNumber();
                        userGuesses.clear();  // clear the user array of guesses to begin a new game
                        System.out.println(aRandomNumber);
                        continuePlay = true;
                    }
                    else continuePlay = false;

                } else {
                    if (rNum.isTooHigh(uNum)) {
                        System.out.println(uNum + " is too high");
                    } else {
                        System.out.println(uNum + " is too Low");
                    }
                }
            }

//            Random random = new Random();
//            int randNum = random.nextInt(1, 6) + 1;
//            System.out.println("This is a random number " + random.nextInt(50));
        }
    }
