public class Office {
	
	//Instanzvariablen
	
	private String name;
	private int seats;
	private int floor;
	
	//Konstruktor 1: nimmt Namen und Sitzplätze als Parameter entgegen (Stockwerk wird auf 1 gesetzt), ruft Konstruktor 2 auf
	
	public Office(String name, int seats) {
		
		this(name, seats, 1);
	}
	//Konstruktor 2: nimmt Namen, Sitzplätze und Stockwerk als Parameter entgegen
	
	public Office(String name, int seats, int floor) {
		
		if (seats < 0) seats = 0;
		this.name = name;
		this.seats = seats;
		this.floor = floor;
	}
	//getXXX: get-Methoden für alle Instanzvariablen
	
	public String getName() {
		
		return name;
	}
	public int getSeats() {
		
		return seats;
	}
	public int getFloor() {
		
		return floor;
	}
	//setXXX: set-Methoden für alle Instanzvariablen
	
	public void setName(String name) {
		
		this.name = name;
	}
	public void setSeats(int seats) {
		
		this.seats = seats;
	}
	public void setFloor(int floor) {
		
		this.floor = floor;
	}
	//toString: textuelle Repräsentation des Büros (siehe Beispiel Ausgabe)
	
	public String toString() {
		
		return "Office " + getName() + " (occupants: " + getSeats() + ", floor: " + getFloor() + ")";
	}
}
