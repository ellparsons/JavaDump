package garage;

public abstract class Vehicle 
{
	
	////Attributes////
	protected String make;
	protected int maxSpeed;	
	
	////Constructors////
	
	public Vehicle (String vMake) 
	{
		this.make = vMake;
		this.maxSpeed = 0;
	}
	public Vehicle (String vMake, int vMaxSpeed)
	{
		this.make = vMake;
		this.maxSpeed = vMaxSpeed;
	}	
	////Methods////
	
	public void maxSpeed (int vMaxSpeed)
	{
		this.maxSpeed = vMaxSpeed;
	}	
	
	public abstract void weight();
}
