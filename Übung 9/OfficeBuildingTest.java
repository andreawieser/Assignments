public class OfficeBuildingTest {
	
	public static void main (String[] args) {
		
		OfficeBuilding officeBuilding = new OfficeBuilding("Main-OfficeBuilding", 10);
		officeBuilding.add(new Office("S1-0043", 3));
		officeBuilding.add(new Office("S1-2043", 5, 2));
		officeBuilding.add(new Office("S1-4048", 7, 4));
		Out.println(officeBuilding);
		boolean canHoldEmployees = officeBuilding.contains(10);
		if (canHoldEmployees) {
			Out.println("There is an office that can fit 10 employees!");
		} else {
			Out.println("Sorry! There is no office that can fit 10 employees.");
		}
		canHoldEmployees = officeBuilding.contains(4);
		if (canHoldEmployees) {
			Out.println("There is an office that can fit 4 employees.");
		} else {
			Out.println("Sorry! There is no office that can fit 4 employees.");
		}
		Out.println("Total office space in Main-OfficeBuiling: " + officeBuilding.totalOfficeSpace());
	}
}
