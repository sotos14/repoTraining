public class Driver{
	
	private String driverName;
	private String licenceType
	private int age;
	
	public Driver(String driverName)
	{
		this.driverName = driverName;
	}

	public String getName()
	{
		return driverName;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}

	public void setLicenceType(String licenceType)
	{
		this.licenceType = licenceType;
	}
}