package barrenMoor;

public class Desert extends BarrenMoor {
	////// Attributes///////
	private String sand;

	////// Constructors/////
	public Desert(String vDescription, 
				  String vCompassDirection,
				  int vNorthLocation,
				  int vEastLocation,
				  int vSouthLocation,
				  int vWestLocation,
				  String vSand) 
	{
		super(vDescription, vCompassDirection, vNorthLocation, vEastLocation, vSouthLocation, vWestLocation);
		this.sand = vSand;
	}

	////// Methods//////

}
