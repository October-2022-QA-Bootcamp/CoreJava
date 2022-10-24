package lec03_java_variables;

public class TofaelTest {
	public static void main(String[] args) {
		Tofael myInfo = new Tofael();
		System.out.println(myInfo.name);
		System.out.println("My Name: " + myInfo.name);
		System.out.println(myInfo.age);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.sex);
		System.out.println(myInfo.usCitizen);
		System.out.println(myInfo.name + myInfo.age + myInfo.sex);
		System.out.println("My Name: " + myInfo.name + ", My Age: " + myInfo.age + ", My Sex: " + myInfo.sex);
	}


}
