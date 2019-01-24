package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Animals> animals = new ArrayList<Animals>();

		Cat cat1 = new Cat("Cat", "Meow", "Black", "Ragdoll");
		animals.add(cat1);
		
		Cat cat2 = new Cat("Cat", "Mreow", "White", "Maine Coon");
		animals.add(cat2);
		
		Pigeon pigeon1 = new Pigeon("Pigeon", "Cheep", 50, "Mourning Dove");
		animals.add(pigeon1);
		
		Pigeon pigeon2 = new Pigeon("Pigeon", "Chirp", 60, "Rock Dove");
		animals.add(pigeon2);
		
		mammals(animals);
	}

	public static void mammals(List<Animals> cats) {
		cats.stream()
				.filter(filter -> filter instanceof Mammal)
				.forEach(System.out::println);
		
	}
}
