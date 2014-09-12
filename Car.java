public class Car{
	
	String manufacturer;
	String color;
	String type;
	int engineSize;

	public Car(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}	

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}

	public void setEngineSize(int engineSize)
	{
		this.engineSize = engineSize;
	}

	public int getEngineSize()
	{
		return engineSize;
	}
}