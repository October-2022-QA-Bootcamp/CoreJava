package lec79_java_coding_challenge;

/*   Implement a large Pyramid of stars in the screen with java.

 		*
 	   * *
      * * *
     * * * *
    * * * * *

*/

//very common interview question

public class G01_makingPyramid {
	public static void pyramid (int n) {
		
		for (int i=0; i<n; i++) {
			// line 21 is printing space only
			for (int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			// Line 25 is printing * then space
			for (int k =0; k<=i; k++) {
				System.out.print("* " );
			}
			// Line 28 is bringing the code to next line
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		pyramid(5);

	}

}
