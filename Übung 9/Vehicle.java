public class Vehicle {
		
	//Instanzvariablen
	
	private String modell;
	private double fuelConsumption;
	
	//Konstruktor 1: parameterlos, intitialisiert das Modell mit einem leeren String und den Durchschnitts-Treibstoffverbrauch/100km des Fahrzeugs mit 01
	
	public Vehicle() {
		
		modell = "";
		fuelConsumption = 0;
	}
	//Konstruktor 2: nimmt Modell und Durchschnitts-Treibstoffverbrauch/100km entgegen
	
	public Vehicle(String modell, double fuelConsumption) {
		
		this.modell = modell;
		this.fuelConsumption = fuelConsumption;
		
		if (fuelConsumption < 0) {
			this.fuelConsumption = 0;
			Out.println("KEIN GUELTIGER VERBRAUCH!");
			Out.println();
		}
	}
	//getXXX: get-Methoden für Modell und Durchschnitts-Treibstoffverbrauch/100km
	
	public String getModell() {
		
		return modell;
	}
	public double averageFuelConsumption() {
		
		return fuelConsumption;
	}
	//setXXX: set-Methoden für Modell und Durchschnitts-Treibstoffverbrauch/100km
	
	public void setModell(String modell) {
		
		this.modell = modell;
	}
	public void setFuelConsumption (double fuelConsumption) {
		
		if (fuelConsumption > 0) {
			this.fuelConsumption = fuelConsumption;
		}
	}
	//fuelUsed: berechnet den verbrauchten Treibstoff für eine gefahrene Strecke in km
	
	public double fuelUsed(double kilometers) {
		
		return fuelConsumption / 100 * kilometers;
	}
	//toString: textuelle Repräsentation des Fahrzeugs (siehe Beispiel Ausgabe)
	
	public String toString() {
		
		return "Make: " + getModell() + " - Fuel Consumption/100km: " + averageFuelConsumption();
	}
}
