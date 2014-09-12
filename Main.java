public class Main{
	public static void main(String[] args){

		Driver driver = new Driver("Sotos");

		Car car = new Car("BMW", "Black", "Sedan", 2.0);

		driver.addCar(car);

		System.out.println(driver.getInfo());
	
	}
}