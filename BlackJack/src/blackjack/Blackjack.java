package blackjack;

import java.util.Random;

public class Blackjack  
	{
static Random numgen = new Random();	
	
	public static void main(String[]args)
	{
		calculation();
	}

	public static void calculation()
	{
		int number1 = (numgen.nextInt(21) +2);
		int number2 = (numgen.nextInt(21) +2);
		System.out.println("Player 1 :"+number1);
		System.out.println("Player 2 :"+number2);
		
		if (number1 < 22 && (number2 > 22))
			{
			System.out.println("You win!");
			}
		else if (number1 > 22 && (number2 <
				22))
			{
			System.out.println("Bust!");
			}
		else if (number1 == 21 && (number2 != 21))
			{
			System.out.println("Player 1, Blackjack!");
			}
 		else if (number1 != 21 && (number2 == 21))
 			{
 			System.out.println("Player 2, Blackjack!");
 			}
 		else if (21 - number1 < (21 - number2))
 			{
 			System.out.println("You win!");
			}
 		else if (21 - number1 > (21 - number2))
			{
			System.out.println("You lose!");
			}
 		else if(number1 == number2)
 			{
 			System.out.println("Draw!");
 			}
		else 
			{
			System.out.println("Error input");
			}
	}
}