package ClassExercise6_2;

import java.util.Scanner;

public class CrapsAddition {
	public static void main(String[] args) {
		Craps game=new Craps();
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter the amount of money you want to start your game with:");
		int amount=input.nextInt();
		//double wProb;
		for (int i = 1; i <= 6_000_000; i++) {
			game.changedGame();
		}
		int lCount = 6_000_000 - game.wCount;
		System.out.println("The player won " + game.wCount + " times");
		System.out.println("The player lose " + lCount + " times");
		
		double wProb= ((double)game.wCount/6_000_000)*100;
		double lProb=((double)lCount/6_000_000)*100;
		
		System.out.println("Probability of winning " + wProb + " %");
		System.out.println("Probability of losing " + lProb + " %");
		
		//5 counting user's balance
		/* From What I understood, each time the user wins
		 * the current amount of money will be doubled but each time the user loses
		 * only the initial(the starting money) amount of money will be deducted */
		double money= amount * (Math.pow(2, game.wCount));
		double finalMoney= money - (amount* lCount);
		
		if (finalMoney > 0) {
			System.out.println("User's balance after the game: "+ finalMoney);
		}
		else {
			System.out.println("User's balance after the game is Zero!!");
		}
		
	}
}
	
