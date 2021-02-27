public class FeldShiften {
	
	static void printArray(int[] drop) {
		
		if (drop == null) Out.print("null");
		if (drop.length == 0) Out.print("null");
		
		for (int i = 0; i < drop.length; i++) {
            if (i>0) {
				Out.print(", ");
			}
            Out.print(drop[i]);
        }
        Out.println("");
	}
	static int[] shiftWithDrop(int[] field, int places) {
		
		int[] shifted = null;
		
		if (field == null || places < 0) {
			return null;
		} else {
			shifted = new int [field.length];
			for (int i = 0; i < field.length; i++) {
				if (field.length <= i + places) {
				} else {
					shifted[i+places] = field[i];
				}
			}
		}
		return shifted;
	}
	static int[] shiftWithRotation(int[] field, int places) {
		
		int [] shifted = null;
		
		if (field == null || places < 0) {
			return null;
		} else {
			shifted = new int [field.length];
			for (int i = 0; i < field.length; i++) {
				if (field.length <= i + places) {
					shifted[(i + places) - field.length] = field[i];
				} else { 
					shifted[i + places] = field[i];
				}
			}
		}
		return shifted;
	}
	public static void main (String[] args) {
		
		int[] a = {};
		printArray(a);
		int[] drop = shiftWithDrop(a, 0);
		printArray(drop); 
		int [] rotated = shiftWithRotation(a, 0);
		printArray(rotated);
		Out.println();
		
		drop = shiftWithDrop(a, 1);
		printArray(drop);
		rotated = shiftWithRotation(a, 1);
		printArray(rotated);
		Out.println();
		
		drop = shiftWithDrop(a, 2);
		printArray(drop);
		rotated = shiftWithRotation(a, 2);
		printArray(rotated);
		Out.println();
		
		drop = shiftWithDrop(a, 6);
		printArray(drop);
		rotated = shiftWithRotation(a, 6);
		printArray(rotated);
	}
}
