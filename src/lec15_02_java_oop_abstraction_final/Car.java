package lec15_02_java_oop_abstraction_final;



public interface Car  {
	
	public void start();
	public abstract void stop();
	public String brake();
		
	public default void honk () {
		System.out.println("Honk Feature from Car Interface");
	}
	
	public static void gear () {
		System.out.println("Gear Feature from Car Interface");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
