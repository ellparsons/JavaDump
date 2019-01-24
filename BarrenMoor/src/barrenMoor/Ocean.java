package barrenMoor;

public class Ocean extends BarrenMoor {
	//////// Attributes///////////
	private String oceanWater;

	//////////// Constructors
	public Ocean(String vDescription, 
				 String vCompassDirection,
				 int vNorthLocation,
				 int vEastLocation,
				 int vSouthLocation,
				 int vWestLocation,
				 String vOceanWater) 
	{
		super(vDescription, vCompassDirection, vNorthLocation, vEastLocation, vSouthLocation, vWestLocation);
		this.oceanWater = vOceanWater;
	}

	////// Methods//////

}
