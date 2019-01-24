package conditonals;

public class Conditionals {

	public static void main(String[] args) {
	calculation (9,9, true);
	}
	
	
	public static void calculation(int number1, int number2, boolean choice) 
		{		
		if (choice)
		{
				System.out.println(number1 * number2);
		}
		else
		{
				System.out.println(number1+number2);
		}
	}
}
