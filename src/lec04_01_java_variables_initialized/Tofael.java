package lec04_01_java_variables_initialized;

public class Tofael {
	// variables initialized
	public String name = "Mohammad Sharkar";
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary =  2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.734435f;
	public double myGrade = 3.8676573457384;
	public char sex = 'M';
	public boolean usCitizen = true;

	// This is a Constructor
	// Here Constructor declared
	public Tofael () {
		System.out.println("This is all about me: \n");
	}
	
	// This is a method
	// Here method implemented
	// I don't need object to call the variables
	public void tofael() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	
}
