package zoo;

public class Pigeon extends Bird
{
////////////Attributes//////////////
	protected String pigeonSpecies;


///////////Constructors/////////////
	public Pigeon(String vType, String vNoise, int vFlightDistance, String vPigeonSpecies) 
	{
		super(vType, vNoise, vFlightDistance);
		this.pigeonSpecies = vPigeonSpecies;
	}


//////////////Methods//////////////


}
