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

	public String getInfo()
	{
		String carinfo = "";

		for(Car car : ownedCars)
		{
			carinfo += "* "+car.getInfo();
		}

		String bar1 = "\n=======================\n";
		String bar2 = "=======================\n";

		String driverInfo = "Name: "+driverName+"\n" +
							"Age: "+age+
							"Licence: "+licenceType+
							"Car(s): "+car.getInfo();

		return driverInfo;
	}
}