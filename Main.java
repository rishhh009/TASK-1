import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfGuesses = 0;
        int userGuess;
        
        System.out.println("welcome to the number guessing game");
        System.out.println("I have selected a random number between");
        
        do{
        System.out.print("Enter your Guess ");
        userGuess = scanner.nextInt();
        numberOfGuesses++;
        
        if(userGuess < generatedNumber){
            System.out.println("too low! try again");
        }
        else if (userGuess < generatedNumber){
            System.out.println("too high! try again");
        }
        else {
            System.out.println("congratulations! you have the right guess in guesses ");   
            
        }
    } while(userGuess != generatedNumber);
    scanner.close();
}
}