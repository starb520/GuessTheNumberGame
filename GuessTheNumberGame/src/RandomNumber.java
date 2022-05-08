import java.util.Scanner;
import java.util.Random; // I only need if I want to use the random package

/**
 * Contains an attribute to hold a randomly
 * generated number and the methods to prompt
 * a user for a number, compare user input
 * and the randomly generated number.
 */
public class RandomNumber {
    // a random number generated within this class and kept updated within
    // this class.
    int randomNumber = 0;
    // generate a random number, can also use the random utility package
    public int generateRandomNumber() {

        randomNumber = (int) (Math.random() * 101);
        return randomNumber;

    }

    public int getUserNumber() {
        Scanner NumberObj = new Scanner(System.in);

        int userNumber = -1;
        while (userNumber > 100 || userNumber < 0) {
            try {
                System.out.println("Enter a number between 1 and 100: ");
                userNumber = Integer.parseInt(NumberObj.nextLine());
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }

        }
        return userNumber;
    }
    // check if the number entered by a user equals the randomly generated
    // number
    public boolean checkForMatch(int userNumber) {
        return (userNumber == randomNumber);
    }

    public boolean isTooHigh(int userNumber) {
        return (userNumber > randomNumber);
    }
}
