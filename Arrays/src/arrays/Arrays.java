package arrays;

public class Arrays {

	public static void main(String[] args) 
	{
		int repeatCount = 0;
		int [] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;
		calculation (numbers[9],numbers[9], false, repeatCount, numbers);
		
	}
	
	
	public static void calculation(int number1, int number2, boolean choice, int count, int[] arrayofInts) 
	{
		for (count = 0; count < 10; count++)
		{	
			if (number1 == 0)
			{
				System.out.print(number2);
			}
			else if(number2 == 0)
			{
				System.out.println(number1);
			}
			else if (choice)
			{
				System.out.println(number1 * number2);
			}
			else
			{
				System.out.println(number1+number2);
			}
		}
	}
}