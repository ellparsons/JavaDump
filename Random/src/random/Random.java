package random;

public class Random {

	public static void main(String[] args) {
		int size = 10;
		int[][] grid = new int[size][size];
		for (int x = 0; x < size; x++) 
		{
			System.out.println("");
			for (int y = 0; y < size; y++)
			{
				
				grid[x][x] = 0;
				if(x ==(size))
				{
					System.out.print(grid[x][y]);
				}
				else 
				{
					System.out.print(grid[x][y] + " ");
				}
			}			
		}
	}

}
