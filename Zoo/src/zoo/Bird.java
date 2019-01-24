package zoo;

public class Bird extends Animals
{	
////////////Attributes//////////////
	protected int flightDistance;
	
		
///////////Constructors/////////////
	public Bird (String vType, String vNoise, int vFlightDistance)
	{
		super(vType,vNoise);
		this.flightDistance = vFlightDistance;
	}
		
//////////////Methods//////////////


}

