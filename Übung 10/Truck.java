public class Truck extends Car {
	
	//Instanzvariablen
	
	private double cargo;
	
	//Konstruktor 1: parameterlos, ruft Konstruktor 3 mit Standardwerten auf
	
	Truck() {
		
		this("no_id", "no_name", "no_model", 1);
	}
	//Konstruktor 2: Beladungskapazität als Parameter, ruft Konstruktor 3 auf
	
	Truck(double cargo) {
		
		this("no_id", "no_name", "no_model", 1);
	}
	//Konstruktor 3: ID, Hersteller, Modell und Beladungskapazität als Parameter
	
	Truck(String id, String manufacturer, String model, double cargo) {
		
		setId(id);
		setManufacturer(manufacturer);
		setModel(model);
		setCargo(cargo);
	}
	//get-Methoden für alle Instanzvariablen

	public double getCargo() {
		
		return cargo;
	}
	//set-Methoden für alle Instanzvariablen
	
	public void setCargo (double cargo) {
		
		if (cargo > 0) {
			this.cargo = cargo;
		} else {
			this.cargo = -1;
		}
	}
	//toString: textuelle Repräsentation eines Lastwagens
	
	public String toString() {
		
		return super.toString() + ", cargo: " + cargo + " kg";
	}
	public String getVehicleType() {
		
		return "truck";
	}
}
