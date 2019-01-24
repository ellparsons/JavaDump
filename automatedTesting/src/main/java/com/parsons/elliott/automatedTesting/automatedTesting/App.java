package com.parsons.elliott.automatedTesting.automatedTesting;

import java.util.Random;

public class App  {
	
static Random numgen = new Random();	
	
	public static void main(String[]args)
	{
		int number1 = (numgen.nextInt(21) +1);
		int number2 = (numgen.nextInt(21) +1);
		calculation(number1,number2);
	} 

	public static String calculation(int number1,int number2)
	{
		System.out.println("Player 1 :"+number1);
		System.out.println("Player 2 :"+number2); 
		
		if (number1 < 22 && (number2 > 22)) 
			{
			return ("You win!");
			}
		else if (number1 > 22 && (number2 <
				22))
			{
			return ("Bust!");
			}
		else if (number1 == 21 && (number2 != 21))
			{
			return ("Player 1, Blackjack!");
			}
 		else if (number1 != 21 && (number2 == 21))
 			{
 			return ("Player 2, Blackjack!");
 			}
 		else if (21 - number1 < (21 - number2))
 			{
 			return ("You win!");
			}
 		else if (21 - number1 > (21 - number2))
			{
			return ("You lose!");
			}
 		else if (number1 == number2)  
 			{ 
 			return ("Draw!");   
 			}
			return (null);			
	}
}
