public class AusgebenEinerMatrix {
	
	static void printMatrix(int[] [] matrix) {
		
		if (matrix == null) {
			Out.println("{{null}}");
		} else if (matrix.length == 0) {
			Out.println("Keine Ausgabe moeglich");
		} else {
			for (int i= 0; i < matrix.length; i++) {
				for (int j= 0; j < matrix[i].length; j++) {
					Out.print(matrix[i][j] + " ");
				}
				Out.println();
			}
			Out.println();
		}
	}
	public static void main (String [] args) {
		
		int[] [] matrix = new int[] [] {};
		printMatrix(matrix);
		Out.println();
		printMatrix(null);
	}
}
