package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[]args)
	{
		List<String> words = Arrays.asList("Hello", " it's", " Dale");
		List<String> capitals = capitalize (words);
		System.out.println(capitals);
		List<String> lowercase = lowercase (words);
		System.out.println(lowercase);
	}
	public static List<String> capitalize(List<String> words) 
	{
		System.out.println(words);
		List<String>capitals = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		return capitals;
	}
	public static List<String> lowercase(List<String> words)
	{
		List<String>lowercase = words.stream().map(word -> word.toLowerCase()).collect(Collectors.toList());
		return lowercase;
	}
}
 