public class OfficeBuilding {
	
	//Instanzvariablen
	
	private Office[] array;
	private String name;
	private int rooms;
	private int count = 0;
	
	//Konstruktor: erhält Namen des Gebäudes und max. Anzahl der Büros als Parameter
	
	public OfficeBuilding(String name, int rooms) {
		
		this.name = name;
		this.rooms = rooms;
		
		if (rooms > 0 && name != null) {
			array = new Office[rooms];
		}
	}
	//add: Büro hinzufügen
	
	public void add(Office l) {
		
		if (count < rooms - 1) {
			array[count] = l;
			count++;
		}
	}
	//contains: überprüft, ob im Gebäude ein Büro existiert, das mindestens eine bestimmte Anzahl von Personen fassen kann
	
	public boolean contains(int spaces) {
		
		boolean contains = false;
		
		if (spaces < 0) { 
			contains = false;
		} else {
			for (int i = 0; i < count && contains == false; i++) {
				if (spaces <= array[i].getSeats()){
					contains = true;
				}
			}
		}
		return contains;
	}
	//totalOfficeSpace: ermittelt die Gesamtanzahl an Angestellten, die in allen Büros eines Gebäudes insgesamt Platz haben
	
	public int totalOfficeSpace() {
		
		int amount = 0;
		
		for (int i = 0; i < count; i++) {
			
			Office spaces = array[i];
			amount += spaces.getSeats();
		}
		return amount;
	}
	//toString: textuelle Repräsentation eines Gebäudes (siehe Beispiel Ausgabe)
	
	public String toString() {
		
		return name + " (" + count + " of " + rooms + " offices specified)";
	}
}
