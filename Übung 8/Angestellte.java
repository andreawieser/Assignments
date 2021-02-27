public class Angestellte {
	
	public static void main (String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Melania", "Musterfrau");
		Employee employee3 = new Employee("07-23-AF");
		Employee employee4 = new Employee("Herbert", "Huber", "44-22-CD");
		Out.println("Name of Employee 2: " + employee2.getFullName());
		Out.println("Employee ID of employee 3: " + employee3.getEmployeeId());
		Out.println("Employee 4: " + employee4.toString());
	}
}
