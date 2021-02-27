public class InventoryList {
	
	//Instanzvariablen
	
	static int add = 0;
	String name; 
	int noItems; 
	String[] itemNames; 
	int[] itemCounts; 
	int amount; 
	
	//Konstruktor (erhält Namen und Kapazität der Liste)
	
	InventoryList(String firm, int number) {
		
		if (number <= 0) {
			itemNames = null;
			itemCounts = null;
			name = firm;
			noItems = number;
		} else {
			name = firm;
			noItems = number;
			itemNames = new String[noItems];
			itemCounts = new int[noItems];
		}
	}
	//Methode addItem: Element hinzufügen
	
	void addItem (String product, int amount) {
		
		itemNames[add] = product;
		itemCounts[add] = amount;
		add++;
	}
	//Methode noTotalItems: liefert die gesamte Anzahl von Gegenständen
	
	int noTotalItems() {
		
		if (itemCounts == null || itemCounts.length <= 0) {
			return amount;
		}
		for (int i = 0; i < itemCounts.length-1; i++) {
			amount += itemCounts[i];
		}
		return amount;
	}	
	//Methode getNumberOf: liefert die Anzahl eines bestimmten Gegenständen
	//Ist der Gegenstand nicht in der Inventarliste vorhanden wird -1 zurück gegeben
	
	int getNumberOf(String product) {
		
		int counter = -1;
		
		if (itemCounts == null || itemCounts.length <= 0) counter = -1;
		if (itemNames == null || itemNames.length <= 0) counter = -1;

		for (int i = 0; i < itemNames.length; i++) {
			String name = itemNames[i];
			if (product.equals(name)) {
				counter = itemCounts[i];
				break;
			}
		}
		return counter;
	}
	//Methode toString: liefert Informationen der Invertarliste als String
	
	public String toString() {
		
		if (itemNames == null || itemNames.length <= 0) return "Fehler";
		if (itemCounts == null || itemCounts.length <= 0) return  "Fehler";
		String list = "";
		for (int i = 0; i < itemNames.length; i++){
			
			if (itemNames[i]!= null)
				if (i > 0) {
					list = list + ", " + itemNames[i] + ": "+ itemCounts[i];
				} else {
					list += itemNames[i] + ": " + itemCounts[i];
				}
		}
		return list;
	}
}
