package garage;

public class Motorcycle extends Vehicle 
{

	////Attributes////
	private int cc;
	private String style;
	private int weight;
	
	
	////Constructors////
	public Motorcycle(int vCc, String vStyle, String vMake, int vMaxSpeed) 
	{
		super(vMake,vMaxSpeed);
		this.cc=vCc;
		this.style=vStyle;
	}

	public Motorcycle() 
	{
		
	}
	
	
	
	
	////Methods////
	
	public void weight()
	{
		
	}
}
