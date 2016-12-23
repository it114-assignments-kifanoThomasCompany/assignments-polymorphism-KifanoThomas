package Poly;

public abstract class AbstractFactory 
{
	/**
	 * 
	 */
	
	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	public Vechicle getVehicleFactory(Vechicle_Type _vt, Vechicle_Producer_Name _vpn, Model_Name _mn)
	{
		return null;
		
	}
	
	public Engine getEngineFactory(EngineType _et, Engine_Producer_Name _epn, Model_Name _mn)
	{
		return null;
		
	}
}
