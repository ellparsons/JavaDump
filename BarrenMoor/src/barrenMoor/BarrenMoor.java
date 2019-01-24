package barrenMoor;

public class BarrenMoor {

	//////////// Attributes//////////////

	private String description;
	private String compassDirection;
	private int northLocation;
	private int eastLocation;
	private int southLocation;
	private int westLocation;

	/////////// Constructors/////////////

	public BarrenMoor(String vDescription, String vCompassDirection, int vNorthLocation, int vEastLocation, int vSouthLocation, int vWestLocation) 
	{
		this.description = vDescription;
		this.compassDirection = vCompassDirection;
		this.northLocation = vNorthLocation;
	    this.eastLocation = vEastLocation;
	    this.southLocation = vSouthLocation;
	    this.westLocation = vWestLocation;
	}

	////////////// Methods//////////////
	
	public String toString()
	{
		return description+" "+compassDirection+" "+northLocation+" "+eastLocation+" "+southLocation+" "+westLocation;	
	}
	
}
