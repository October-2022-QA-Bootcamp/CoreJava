package lec05_03_java_casting;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		double myGrade = 3.0653625472;
		System.out.println(myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		int myNewGrade = (int) myGrade; // casting here
		System.out.println(myNewGrade);
		
		// How can you convert a double to a byte type?
		// By Narrowing casting
		byte myNewGradeInByte = (byte) myGrade; // casting here
		System.out.println(myNewGradeInByte);
	}

}
