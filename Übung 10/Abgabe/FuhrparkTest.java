public class FuhrparkTest {
	
	public static void main (String[] args) {
		
		Fuhrpark fleet = new Fuhrpark();
		Out.println("My " + fleet.getNoVehicles() + " vehicles: ");
		Out.println(fleet);
		Out.println();
		fleet.add(new Truck());
		fleet.add(new Bike("", "", 0));
		fleet.add(new Car());
		Out.println("My " + fleet.getNoVehicles() + " vehicles: ");
		Out.println(fleet);
	}
}
/*
public class FuhrparkTest {
	
	public static void main (String[] args) {
		
		Fuhrpark fleet = new Fuhrpark();
		Out.println("My " + fleet.getNoVehicles() + " vehicles: ");
		Out.println(fleet);
		Out.println();
		fleet.add(new Car("FR742AS", "Fiat", "500"));
		fleet.add(new Car("UU 174 VV","Porsche","Cayenn"));
		fleet.add(new Bike("my main bike", "mountain bike", 21));
		fleet.add(new Bike("my other bike", "city bike", 6));
		fleet.add(new Truck("UU12247", "Chevrolet", "Silverad", 3400));
		Out.println("My " + fleet.getNoVehicles() + " vehicles: ");
		Out.println(fleet);
	}
}
*/
