package streamPrime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrime 
{
	
	public static void main(String[]args)
	{
		List<Integer>numbers = Arrays.asList(10,7,3,9,11);
		Collections.sort(numbers);
		List<Integer>newList = numbers.stream().filter(filter->isPrime(filter)).collect(Collectors.toList());
		System.out.println(newList);
	}
	
	public static boolean isPrime(int x)
	{
		boolean isPrime = true;
		
			for (int i = 3; i <= x/2; i++)
			{
				if ((x % i) != 0)
				{				
					isPrime = true;
				}				
					
				else if((x % i) == 0)
				{				
					isPrime = false;
					break;
				}
			}	
			return isPrime;
	}

}
