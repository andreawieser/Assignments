public class TruckTest {
	
	public static void main (String[] args) {
		
		Truck truck1 = new Truck("UU12247", "Chevrolet", "Silverado", 3400);
		Out.println(truck1);
		truck1.setCargo(4500);
		Out.println("new capacity: " + truck1.getCargo() + " kg");
	}
}
