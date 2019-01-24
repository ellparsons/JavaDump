package conditionals2;

public class Conditionals2 {

	public static void main(String[] args) {
	calculation (9,9, true);
	}
	
	
	public static void calculation(int number1, int number2, boolean choice) 
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
