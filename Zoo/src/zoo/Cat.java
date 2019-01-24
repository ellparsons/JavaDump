package zoo;

public class Cat extends Mammal{

////////////Attributes//////////////
	protected String catSpecies;


///////////Constructors/////////////
	public Cat(String vType, String vNoise, String vHairColour, String vCatSpecies) 
	{
		super(vType, vNoise, vHairColour);
		this.catSpecies = vCatSpecies;
	}


//////////////Methods//////////////


}
