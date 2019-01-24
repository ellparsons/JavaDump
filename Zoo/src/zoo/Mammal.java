package zoo;

public class Mammal extends Animals
{
////////////Attributes//////////////
	protected String hairColour;
	
	
///////////Constructors/////////////
	public Mammal(String vType, String vNoise, String vHairColour)
	{
		super(vType,vNoise);
		this.hairColour = vHairColour;
	}
	
//////////////Methods//////////////


}

