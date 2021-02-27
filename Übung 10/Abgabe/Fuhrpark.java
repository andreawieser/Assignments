public class Fuhrpark extends Car {
	
	//Instanzvariablen, Fahrzeuge werden in einem Feld abgelegt
	
	protected Vehicle[] fleet;
	protected int noVehicles;
	
	//Konstruktor 1: parameterlos, ruft Konstruktor 2 mit Standardkapazität auf
	
	Fuhrpark() {
		
		this(25);
	}
	//Konstruktor 2: max. Anzahl von Fahrzeugen als Parameter
	
	Fuhrpark(int maxVehicles) {
		
		if (maxVehicles < 0) {
			fleet = new Vehicle[25];
		} else {
			fleet = new Vehicle[maxVehicles];
		}
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
		
		if (v == null) {
			return;
		}
		else if (noVehicles < fleet.length - 1) {
			fleet[noVehicles] = v;
			noVehicles++;
		}
	}
	//toString: textuelle Repräsentation des Fuhrpark
	
	public String toString() {
		
		String output = "";
		
		if (noVehicles == 0) {
			output = "no vehicles available";
		} else {
			for (int i = 0; i < noVehicles; i++) {
				output += (i+1) + ". " + fleet[i].toString() + "\n";
			}
		}
		return output;
	}
}
