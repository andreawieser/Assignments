public class Fuhrpark extends Car {
	
	//Instanzvariablen, Fahrzeuge werden in einem Feld abgelegt
	
	private Vehicle[] fleet;
	private int noVehicles = 0;
	
	//Konstruktor 1: parameterlos, ruft Konstruktor 2 mit Standardkapazität auf
	
	public Fuhrpark() {
		
		for (int i = 0; i < 25; i++) {
			fleet[1] = new Car();
		}
	}
	//Konstruktor 2: max. Anzahl von Fahrzeugen als Parameter
	
	public Fuhrpark(int noVehicles) {
		
		this.noVehicles = noVehicles;
	}
	//get/set-Methoden für Instanzvariablen
	
	public int getNoVehicles() {
		
		return noVehicles;
	}
	public void setNoVehicles() {
		
		this.noVehicles = noVehicles;
	}
	//add: fügt ein neues Fahrzeug zum Fuhrpark hinzu
	
	public void add(Vehicle v) {
		
		if (v != null) {
			fleet[noVehicles] = v;
			noVehicles++;
		} else {
			return;
		}
	}
	//toString: textuelle Repräsentation des Fuhrpark
	
	public String toString() {
		
		String output = "";
		
		for (int i = 0; i < noVehicles; i++) {
			output += i + ". " + fleet[i].toString() + "\n";
		}
		return output;
	}
}
