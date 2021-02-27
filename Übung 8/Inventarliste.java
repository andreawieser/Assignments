public class Inventarliste {
	
	public static void main (String[] args) {
		
		InventoryList inventory = new InventoryList("My Company", 100);
		inventory.addItem("cable", 20);
		inventory.addItem("monitor", 5);
		inventory.addItem("computer", 5);
		Out.print("My Company: ");
		Out.println(inventory);
		Out.println("#total items: " + inventory.noTotalItems());
		Out.println("#cable: " + inventory.getNumberOf("cable"));
		Out.println("#monitor: " + inventory.getNumberOf("monitor"));
		Out.println("#computer: " + inventory.getNumberOf("computer"));
		Out.println("#laptop: " + inventory.getNumberOf("laptop"));
		
	}
}
