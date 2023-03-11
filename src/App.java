import java.util.Scanner;  
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int guesses = 3;
        int answer = rand.nextInt(10)+1;
        
        do {
            System.out.println("Please, guess a number between 1 to 10");
            // check if guess is int, if guess is not int show message reprompt
            int guess = userInput.nextInt();
            
            //if (guess != (int)guess) {
                //  System.out.println("Your guess is not a whole number");
                //}
                System.out.println("Guess: " + guess);
                //check is guess is in range
                if (guess < 1 || guess > 10){
                    System.out.println("Please choose a number within the range");
                }

                if (guess == answer){
                    System.out.println("Congratulations you won");
                    break;
                } else {
                    // when guess is wrong, deduct guesses by 1 
                    System.out.print("Wrong answer\n");
                    guesses -= 1; 
                    System.out.println("You have  " + guesses + " guesses remaining\n ");
                }
            } while (guesses > 0);
            
            if (guesses <= 0 ){
                System.out.println("Game over\n");
                System.out.println("The correct answer was " + answer);
            }
            
            userInput.close();
                
            }
        }
        