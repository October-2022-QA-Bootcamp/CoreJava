package lec80_java_coding_challenge;

// FIND WHO IS UNIQUE, NO DUPLICATION
public class I04_find_the_element_that_appears_once_in_array {
	static int[] array = { 2, 3, 5, 4, 5, 3, 4, 1, 3, 2 };
	static int size = array.length;

	public static void findUniqueData(int[] array, int size) {
		// TODO A nice explanation is necessary for line 11, why inside
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(array[i] + " is only occurs once.");
			}
		}
	}

	public static void main(String[] args) {
		findUniqueData(array, size);
	}

}
