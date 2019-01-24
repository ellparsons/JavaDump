package barrenMoor;

public class Treasure extends BarrenMoor {
	////// Attributes///////
	private String treasureChest;

	///// Constructors///////
	public Treasure(String vDescription, 
					String vCompassDirection,
					int vNorthLocation,
					int vEastLocation,
					int vSouthLocation,
					int vWestLocation,
					String vTreasureChest)
	{
		super(vDescription, vCompassDirection, vNorthLocation, vEastLocation, vSouthLocation, vWestLocation);
		this.treasureChest = vTreasureChest;
	}

	//////// Methods////////

}
