public class Sudokubox {
	
	static boolean isValidSudokuBox(int[] [] numbers) {
		
		if (numbers == null) return false;
		if (numbers.length != 9) return false;
		
		int[] array = new int[9];
		
		for (int i = 0; i < 3; i++) {
			array[i] = numbers [0][i];
			array[i+3] = numbers [1][i];
			array[i+6] = numbers [2][i];
		}
		boolean valid = true;
		
		int[] normal = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		if (array.length != 9) {
			valid = false;
			return false;
		} 
		int i = 0;
		
		while (valid && i < 9) {
			int counter = 8;
			while (counter >= 0) {
				if (array[counter] != normal[i]) {
					counter--;
					valid = false;
				} else {
					counter = -1;
					valid = true;
				}
			}
			i++;
		}
		if (!(valid)){
			return false;
		} 
		return true;
	}
	static void printArray (int[] [] array) {
		
		if (array == null) {
			Out.println("false");
		} else if (array.length != 9) {
			Out.println("false");
		} else {
			for (int i= 0; i < array.length; i++) {
				for (int j= 0; j < array[i].length; j++) {
					Out.print(array[i][j] + " ");
				}
				Out.println();
			}
			Out.println();
		}
	}
	public static void main (String[] args) {
		
		int[] [] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		//int[] [] array = new int[0] [0];
		//int[] [] array = {{-1, 3, 3}, {4, 5, 5}, {7, 11, 8}};
		//int[] [] array = {{6, 5, 4}, {7, 3, 2}, {1, 8, 9}};
		printArray(array);
	}
}
