public class Driver{
	
	private String driverName;
	private String licenceType
	private int age;
	private ArrayList<Car> ownedCars;
	
	public Driver(String driverName)
	{
		this.driverName = driverName;
		ownedCars = new ArrayList<Car>();
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

	public void addCar(Car car)
	{
		ownedCars.add(car);
	}

	public ArrayList<Car> getCars()
	{
		return ownedCars;
	}
}