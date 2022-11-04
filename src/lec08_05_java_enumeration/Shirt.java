package lec08_05_java_enumeration;

public class Shirt {
	Size chart;
	

	public Shirt() {
		
	}
	
	public Shirt(Size chart) {
		this.chart = chart;
	}
	
	public void findMyShirt() {
		
		switch (chart) {
		
		case XSmall:
			System.out.println("Extra Small Size Shirt is selected");
			break;
		
		case Small:
			System.out.println("Small Size Shirt is selected");
			break;
			
		case Medium:
			System.out.println("Medium Size Shirt is selected");
			break;
			
		case Large:
			System.out.println("Large Size Shirt is selected");
			break;
			
		case XLarge:
			System.out.println("Extra Large Size Shirt is selected");
			break;
			
		case XXLarge:
			System.out.println("Extra Extra Large Shirt is selected");
			break;
		
		default:
			System.out.println("Sorry! We are out of Stock");
			break;		
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
