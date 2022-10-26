package lec04_02_java_variables_declared;

public class MyInfoTest {
	public static void main(String[] args) {
		MyInfo info1 = new MyInfo(); // Constructor is initialized here
		// Variables are initialized
		info1.name = "Mohammad Sharkar";
		info1.age = 127;
		info1.myApartmentRent = 32445;
		info1.myYearlySalary = 376482364;
		info1.myBankBalance = 7658736472686l;
		info1.myHeight = 1.679f;
		info1.myGrade = 3.67568346;
		info1.sex = 'M';
		info1.usCitizen = false;		
		info1.myInfo(); // Method is Initialized
		
		System.out.println("\n--------------------------------------------------\n");
		MyInfo info2 = new MyInfo();
		// Variables are initialized
		info2.name = "Angelina J";
		info2.age = 100;
		info2.myApartmentRent = 30005;
		info2.myYearlySalary = 476482364;
		info2.myBankBalance = 2658736472686l;
		info2.myHeight = 1.979f;
		info2.myGrade = 3.97568346;
		info2.sex = 'F';
		info2.usCitizen = true;		
		info2.myInfo(); // method initialized
	
	}


}
