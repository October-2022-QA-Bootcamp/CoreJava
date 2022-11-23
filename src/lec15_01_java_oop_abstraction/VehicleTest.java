package lec15_01_java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyotaInfo();
		toyota.toyotaPrice();
		Toyota.countryOfOrigin();
		// if a method is static, no need to create an object, the class or Interface can directly call it.
		toyota.rent();
		toyota.carryingPassenger();
		toyota.carryingGoods();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.lightWeight();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.carName();
		toyota.autopilot();
		toyota.battery();
		// toyota.yearEstablished(); 
		// it is giving us warning, because static method of Abstract class
		// yearEstablished() is a static method in Abstract class, Toyota class, (not object) can extends that Abstract class, 
		Toyota.yearEstablished();
		toyota.flyingFeature();
		toyota.honk();
		// toyota.gear();
		// so, Toyota class itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota
		// Toyota.gear();
		 // gear () is a static method of an Interface, static method of Interface can't be call by object of a regular class or directly by the regular class
		toyota.honk1();
		// variables from regular class
		System.out.println("Toyota manufactured at: " + toyota.yearOfManufacture);
		// variables from abstract class
		System.out.println("Price of Electric Car: " + toyota.costOfTesla);
		// variables from Interface
		System.out.println("Car Invented: " + Toyota.INVENTED);
		// as INVENTED variable is static and Toyota class implements Car, that's why no error
			
		// Cannot instantiate the type Car which is an Interface
		// an interface can't be instantiated, it needs the help of a concrete class, here Toyota is a concrete class, Because Toyota  implement the Car Interface
		// Interview question: why Interface can't instantiate? because implementation is (not complete) as abstract methods present inside it
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake();
		car.honk();
		Car.gear();
		car.honk1();
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.INVENTED );
		
		// If no abstract method is present in Interface, it still can't instantiated
		// CableCar cableCar = new CableCar();
		
		// Cannot instantiate the type ElectricCar because
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota is the concrete class
		// Interview question: why? because implementation is not complete as some abstract methods present insisde it
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new Toyota ();
		electricCar.battery();
		electricCar.price();
		electricCar.carName();
		ElectricCar.yearEstablished();
		electricCar.flyingFeature();
		electricCar.autopilot();
		electricCar.expensive();
		electricCar.canFloat();
		System.out.println("Electric Car name: " + electricCar.nameOfElectricCar + ", and price: " + electricCar.costOfTesla);
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
		
		
		
		
		
		
			
	
	
	
	}

}
