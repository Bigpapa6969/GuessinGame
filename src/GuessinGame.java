import javax.swing.*;

/**
This is a game where you can guess a number from the computer.
 */
public class GuessinGame {
    public static void main(String[] args){
        // generate random int number from 1 - 100
        int computerGeneratedRandomNumber = 0;
        int userAnswer = 0;
        int numberOfGuesses = 1;

        computerGeneratedRandomNumber = (int)(Math.random() *50 + 1);
        System.out.println("The correct answer is: " + computerGeneratedRandomNumber);


        while (userAnswer != computerGeneratedRandomNumber){
            String response = JOptionPane.showInputDialog(null, "Enter a number between 1 - 50", "Guessing game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerGeneratedRandomNumber, numberOfGuesses));
            numberOfGuesses++;
        }

    }
    public static String determineGuess(int userAnswer, int computerGeneratedRandomNumber, int numberOfGuesses){
        if (userAnswer < 0 || userAnswer > 50){
            return "enter a valid answer";
        }
        else if (userAnswer > computerGeneratedRandomNumber){
            return "your number is higher";
        }
        else if(userAnswer < computerGeneratedRandomNumber){
            return "your number is lower";
        }
        else if (numberOfGuesses == 1){
            return "congratulations you took " + numberOfGuesses + " try to guess " + computerGeneratedRandomNumber;
        }
        else {
            return "congratulations you took " + numberOfGuesses + " tries to guess " + computerGeneratedRandomNumber;
        }
    }
}
