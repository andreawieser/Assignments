public class VehicleTest {
		
	public static void main (String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle("Porsche 911", 15.25);
		Vehicle vehicle3 = new Vehicle("Mini Cooper", 6.5);
		
		Out.println(vehicle1);
		Out.println(vehicle2);
		Out.println(vehicle3);
		Out.println("");
		double fuelUsedV2 = vehicle2.fuelUsed(75.0);
		double fuelUsedV3 = vehicle3.fuelUsed(40.0);
		
		Out.println(vehicle2 + " | fuel used for " + 75 + " km: " + round(fuelUsedV2));
		Out.println(vehicle3 + " | fuel used for " + 40.5 + " km: " + round(fuelUsedV3));
	}
	public static double round (double val) {
		
		return (double) Math.round(val * 100) / 100;
	}
}
