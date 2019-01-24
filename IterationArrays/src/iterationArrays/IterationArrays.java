package iterationArrays;

public class IterationArrays {

	public static void main(String[] args) 
	{
		int repeatCount = 0;
		int [] numbers = new int[10];
		calculation (false, repeatCount, numbers);
		
	}
	
	
	public static void calculation(boolean choice, int count, int[] numbers) 
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
			for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = numbers[i] * 10;
				System.out.println(numbers[i]);
			}
			
	}
}