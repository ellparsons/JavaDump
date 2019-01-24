package zoo;

public abstract class Animals
{		
////////////Attributes//////////////
	protected String type;
	protected String noise;
		
		
///////////Constructors/////////////
	public Animals(String vType) 
	{
		this.type = vType; 
		this.noise = "N/A";
	}
	public Animals(String vType, String vNoise)
	{
		this.type = vType;
		this.noise = vNoise;
	}
		
	
//////////////Methods//////////////
	
	public String getNoise()
	{
		return noise;	
	}
	public String getType()
	{
		return type;
	}
		
}
