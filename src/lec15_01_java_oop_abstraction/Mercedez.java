package lec15_01_java_oop_abstraction;

public class Mercedez extends SolarCar {
	public void mercedezInfo() {
		System.out.println("Invented in Germany");
	}

	@Override
	public void speed() {
		System.out.println("This speed method is from SolarCar Abstract Class");
		
	}

	@Override
	public int cost() {
		int scPrice = 2000;
		System.out.println(scPrice);
		return scPrice;
	}

}
