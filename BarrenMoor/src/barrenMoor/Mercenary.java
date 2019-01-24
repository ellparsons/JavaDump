package barrenMoor;

public class Mercenary extends BarrenMoor {
	/////// Attributes
	private String mercenary;

	//////// Constructors
	public Mercenary(String vDescription, 
				 	String vCompassDirection,
				 	int vNorthLocation,
				 	int vEastLocation,
				    int vSouthLocation,
				    int vWestLocation,
				    String vMercenary) 
	{
		super(vDescription, vCompassDirection, vNorthLocation, vEastLocation, vSouthLocation, vWestLocation);
		this.mercenary = vMercenary;
	}

	/////////// Methods

}
