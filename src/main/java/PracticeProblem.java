public class PracticeProblem {

	public static int find(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}

	public static int findLast(String[] array, String string) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals(string)) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] array, char character) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
				if (count == 2) {
					return i;
				}
			}
		}
		if (count == 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == character) {
					return i;
				}
			}
		}
		return -1;
	}
}
