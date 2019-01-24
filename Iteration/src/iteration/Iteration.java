package iteration;

public class Iteration {

	public static void main(String[] args) 
	{
		int repeatCount = 0;
		calculation (9,9, true, repeatCount);
	}
	
	
	public static void calculation(int number1, int number2, boolean choice, int count) 
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