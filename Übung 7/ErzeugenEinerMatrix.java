public class ErzeugenEinerMatrix {
	
	static int[] [] randomMatrix(int m, int n, int z) {
		
		if (m <= 0 || n <= 0) {
			return null; 
		}
		int[][] matrix = new int [m] [n];
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				int random = (int)(Math.random()*z)+1;
				matrix[i][j] = random;
			}
		}
		return matrix;
	}
	static void printMatrix(int[] [] matrix) {
		
		if (matrix == null) {
			Out.println("null");
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
	public static void main (String[] args) {
		
		int m = 5; 
		int n = 5;
		int z = 100;
		
		int[] [] matrix = randomMatrix(m, n, z);

		Out.println("Zeilen: " + m);
		Out.println("Spalten: " + n);
		Out.println();
		printMatrix(matrix);
	}
}
