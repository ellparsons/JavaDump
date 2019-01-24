package minesweeper;

import java.util.Random;

public class Minesweeper {
	public static int[][] Grid;
	public static int maxGridSize;
	
	public static void main (String[]args)
	{
		maxGridSize = 20;
		Grid = new int[maxGridSize][maxGridSize];
		
		for(int i = 0; i < maxGridSize; i++) 
		{
				for(int j = 0; j < maxGridSize; j++)
				{
					int fillGrid = getRandomNumberInRange(0, 1);
					
					Grid[i][j] = fillGrid;
					if(j == (maxGridSize - 1)) 
					{
						System.out.println(Grid[i][j]);
					}
					else
					{
						System.out.print(Grid[i][j] + " ");
					}
				}	
				
		}
		
	}
	
	private static int getRandomNumberInRange(int min, int max) 
	{		
	if(min >= max)
	{throw new IllegalArgumentException("max must be greaqter than min");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
	
	}
}
 