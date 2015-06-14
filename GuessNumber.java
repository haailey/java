import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
	public static void main(String[] args)
	{
		Random read = new Random();
		double numberToGuess = read.nextInt(10);
		double numberToGuess = (double)(Math.round(numberToGuess*100))/100;
		int numberOfTries = 0;//create variables to track numbers.
		Scanner input = new Scanner(System.in);
		double guess;//create a variable that stores the input from the user
		boolean win = false;//track whether or not the player has won

		while (win == false)//while loop keeps going until a condition is no longer true
		{
			System.out.println("Guess a number between 1 and 10: ");
			guess = input.nextDouble();
			numberOfTries++;

			if (guess == numberToGuess){//if statement tells computer to tell us if this guess was too high or too low.
				win = true;
			}
			else if (guess < numberToGuess){
			System.out.println("Your guess is too low");
			}
			else if (guess > numberToGuess){
				System.out.println("Your guess is too high");
			}
		}    

		System.out.println("You win!");
		System.out.println("The number was"+numberToGuess);
		System.out.println("It took you"+numberOfTries+"tries");
	}
}