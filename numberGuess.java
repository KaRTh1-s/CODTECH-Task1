import java.util.*;

public class guessNumber {

	public static void main(String[] args) {
		Random random=new Random();
		int numberToGuess=random.nextInt(100)+1;
		int tries=0;
		Scanner s=new Scanner(System.in);
		int guess;
		boolean win=false;
		System.out.println("Enter a number between 1 to 100 : ");
		while(!win)
		{
			guess=s.nextInt();
			tries++;
			if(guess<numberToGuess)
			{
				System.out.println("Too low! Better luck next time...");
			}
			else if(guess > numberToGuess)
			{
				System.out.println("Too high! Relax and try again...");
			}
			else
			{
				win=true;
				System.out.println("Correct! You guessed in "+tries+" tries.");
			}
		}
		
      s.close();
	}

}