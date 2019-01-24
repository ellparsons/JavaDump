package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {

	public static void main (String[]args)
	{ 
		Random rand = new Random();
		String arrayForGame[] = {"Rock", "Paper", "Scissors"}; 
		int index = rand.nextInt(arrayForGame.length);
		String computerChoice = arrayForGame[index]; 
		System.out.println(computerChoice);
		Game("Rock", computerChoice);  
	}
 	
	public static String Game (String userChoice, String computerChoice)
	{
		if	 
			(userChoice == "Rock" && computerChoice == "Scissors") {
			return "Win";
		}
		else if 
			(userChoice == "Rock" && computerChoice == "Paper") {
			return "Lose";
		}
		else if 
			(userChoice == "Rock" && computerChoice == "Rock") {
			return "Draw";
		}
		else if  
			(userChoice == "Paper" && computerChoice == "Scissors") {
			return "Lose";
		}
		else if 
			(userChoice == "Paper" && computerChoice == "Paper") {
			return "Draw";
		}
		else if 
			(userChoice == "Paper" && computerChoice == "Rock") {
			return "Win";
		}
		else if 
			(userChoice == "Scissors" && computerChoice == "Scissors") {
			return "Draw";
		}
		else if 
			(userChoice == "Scissors" && computerChoice == "Paper") {
			return "Win";
		}
		else if(userChoice == "Scissors" && computerChoice == "Rock") {
			return "Lose";
		}
		else 
		{ 
			return "Error"; 
		}
		
	}
}
