public class Employee {
	
	//Instanzvariablen
	
	String firstName;
	String lastName;
	String employeeId;
	
	//Konstruktor 1, nimmt Vorname und Nachname entgegen, intialisiert die Mitarbeiter ID mit einem leeren String
	
	Employee(String first, String second) {
		
		firstName = first;
		lastName = second;
		employeeId = "";
	}
	//Konstruktor 2, nimmt die Mitarbeiter ID entgegen, intialisiert Vorname und Nachname und Mitarbeiter ID mit einem leeren String
	
	Employee(String id) {
		
		firstName = "";
		lastName = "";
		employeeId = id;
	}
	//Konstruktor 3, nimmt Vorname, Nachname und Mitarbeiter ID entgegen
	
	Employee(String first, String second, String id) {
		
		firstName = first;
		lastName = second;
		employeeId = id;
	}
	//Konstruktor 4, parameterlos (initalisiert Vorname, Nachname und Mitarbeiter ID mit einem leeren String
	
	Employee() {
		
		firstName = "";
		lastName = "";
		employeeId = "";
	}
	//Methode getEmployeeId: gibt die Mitarbeiter ID als String zurück
	
	String getEmployeeId() {
		
		return employeeId;
	}
	//Methode getFullName: gibt den Vornamen und Nachnamen als String zurück
	
	String getFullName() {
		
		return firstName + " " + lastName;
	}
	//Methode toString: gibt alle Informationen als String zurück
	
	public String toString() {
		
		return firstName + " " + lastName + ", " + employeeId;
	}
}
