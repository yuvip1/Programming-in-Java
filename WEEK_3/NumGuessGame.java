package WEEK_3;
import java.util.Random;
import java.util.Scanner;

public class NumGuessGame {

    public static void main(String[] args){

        
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    int guess;
    int attempts = 0;
    int min = 0;
    int max = 100;
    int randomNum = random.nextInt(min, max+1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d\n", min, max);

    do{

        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        attempts++;

        if(guess < randomNum){
            System.out.println("TOO LOW");

        }
        else if(guess > randomNum){
            System.out.println("TOO HIGH");
        }
        else{
            System.out.println("Correct the number is: " + randomNum );
            System.out.println("# of attempts = " + attempts);
        }

       
    }while(guess != randomNum);

    System.out.println("You have won");


    scanner.close();

    }

    
}
