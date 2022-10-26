package lec04_02_java_variables_declared;

public class MyInfo {
	// variables declared
	// Advantage of Variables declared?
	// We can initialize different value by creating different object
	public String name;
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	// This is a Constructor
	// Here Constructor declared
	public MyInfo () {
		System.out.println("This is all about me: \n");
	}
	
	// This is a method
	// Here method implemented
	// I don't need object to call the variables
	public void myInfo() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	
}
