package lec15_02_java_oop_abstraction_final;

public class VehicleTestByUsingAnonymousInnerClass {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyotaInfo();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.price();
		toyota.battery();
		toyota.honk();
	
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		//  what’s the other way to instantiate a interface with out implementing a class
		// Instantiated by anonymous inner class Car, no need of concrete class
		Car car = new Car() {
			
			
			@Override
			public void start() {
				System.out.println("start method");
				
			}
			@Override
			public void stop() {
				System.out.println("stop method");
			}
						
			
			@Override
			public String brake() {
				String m = "brake method";
				System.out.println(m);
				return m;
				
			}
		};
			
		car.start();
		car.stop();
		car.brake();
		car.honk();
		Car.gear();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new ElectricCar() {
			
			@Override
			public void price() {
				System.out.println("price method");
				
			}
		};
		electricCar.battery();
		electricCar.price();
			
	}

}
