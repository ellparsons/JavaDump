package barrenMoor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	
	static Random numgen = new Random();
	
	public static void main(String[]args) {
		List<BarrenMoor> locations = new ArrayList<BarrenMoor>();
	
		////Oceans/////
		Ocean ocean1 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean1);	
		Ocean ocean2 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean2);	
		Ocean ocean3 = new Ocean("descHold", null, 0, 0, 0, 0, null);
		locations.add(ocean3);	
		
		/////Treasures//////
		Treasure treasure1 = new Treasure ("As you continue to walk you arrive at a treasure chest! Hooray you can now order an uber.","", 0, 0, 0, 0, null);
		locations.add(treasure1);
		Treasure treasure2 = new Treasure ("As you continue to walk you see a shiny object in the distance, It's a treasure Chest!.","", 0, 0, 0, 0, null);
		locations.add(treasure2);	
		Treasure treasure3 = new Treasure ("As you continue to walk you stumble upon a crate. The crate contain a; Shovel, Hammer, Nails, Axe, Torch and some batteries.","", 0, 0, 0, 0, null);
		locations.add(treasure3);	
		
		/////Mercenaries//////
		Mercenary mercenary1 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary1);	
		Mercenary mercenary2 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary2);	
		Mercenary mercenary3 = new Mercenary("descHold", null, 0, 0, 0, 0, null);
		locations.add(mercenary3);		
		
		/////Deserts////////
		Desert desert1 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert1);
		Desert desert2 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert2);
		Desert desert3 = new Desert("descHold", null, 0, 0, 0, 0, null);
		locations.add(desert3);
	
		System.out.println(cycle(locations));
	}
	
	public static BarrenMoor cycle (List<BarrenMoor>locations) 
	{
		Random rand = new Random();
		String biomeChoiceArray[] = {"Ocean","Treasure","Mercenary","Desert"}; 
		int index = rand.nextInt(biomeChoiceArray.length);
		String biomeChoice = biomeChoiceArray[index]; 
		if 
			(biomeChoice == "Ocean")
			return oceanBiomes(locations);		
		else if
			(biomeChoice == "Treasure")
			return treasureBiomes(locations);
		else if
			(biomeChoice == "Mercenary")
			return mercenaryBiomes(locations);
		else if
			(biomeChoice == "Desert")
			return desertBiomes(locations);
		else
			System.out.println("Something went wrong");
			return null;
	}
	
	
	public static BarrenMoor oceanBiomes (List<BarrenMoor>locations) 
	{
		List<BarrenMoor> oceanSelect = locations.stream()
			    .filter(filter -> filter instanceof Ocean)
			    .collect(Collectors.toList()); 
				
				int oceanIndexSelection = (numgen.nextInt(2));
				return (oceanSelect.get(oceanIndexSelection));
	}
	

	public static BarrenMoor treasureBiomes (List<BarrenMoor>locations) 
	{
		List<BarrenMoor> treasureSelect = locations.stream()
			    .filter(filter -> filter instanceof Treasure)
			    .collect(Collectors.toList()); 		
				
				int treasureIndexSelection = (numgen.nextInt(2));
				return (treasureSelect.get(treasureIndexSelection));
	}
	
	public static BarrenMoor mercenaryBiomes (List<BarrenMoor>locations) 
	{
		List<BarrenMoor> mercenarySelect = locations.stream()
			    .filter(filter -> filter instanceof Mercenary)
			    .collect(Collectors.toList()); 		
				
				int mercenaryIndexSelection = (numgen.nextInt(2));
				return (mercenarySelect.get(mercenaryIndexSelection));
	}
	
	public static BarrenMoor desertBiomes (List<BarrenMoor>locations) 
	{
		List<BarrenMoor> desertSelect = locations.stream()
			    .filter(filter -> filter instanceof Desert)
			    .collect(Collectors.toList()); 		
				
				int desertIndexSelection = (numgen.nextInt(2));
				return (desertSelect.get(desertIndexSelection));
	}
		

}


/////System.out.print("You have awoke in a strange place unaware of your location, All you see is a compass on your wrist and decide to head off in either; North, East, South or West.");
