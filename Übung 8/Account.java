public class Account {
	
	//Instanzvariablen
	
	double cardNumber;
	String fullName;
	double balance;
	double limit;
	
	//Konstruktor 1: parameterlos
	//initalisiert das Konto mit Kartennummer 0, Name "", aktuellen Schulden 0, Kreditkartenlimit 500
	
	Account() {
		
		cardNumber = 0;
		fullName = "";
		balance = 0;
		limit = 500;
	}
	//Konstruktor 2, Kartennummer, Name, aktuellen Schulden und Kreditkartenlimit als Parameter
	Account(int num, String name, double bal, double lim) {
		
		cardNumber = num;
		fullName = name;
		balance = bal;
		limit = lim;
	}
	//Methode getBalance: gibt die Kredikarten Schulden als double-Wert zurück
	
	double getBalance() {
		
		return balance;
	}
	//Methode isCovered: überprüft, ob ein bestimmter Betrag mit der Kreditkarte bezahlt werden kann
	//(unter Berücksichtigung des Limits) 
	
	boolean isCovered(double amount) {
		
		return balance + amount <= limit;
	}
	//Methode pay: bezahlt einen Betrag mit der Kreditkarte
	//Hat das Konto nicht die erforderliche Deckung (unter Berücksichtigung des Limits), dann wird der Betrag nicht bezahlt
	
	double pay(double amount) {
		
		if (isCovered(amount)) {
			balance += amount;
		}
		return balance;
	}
	//Methode deposit: deckt einen bestimmten Betrag der Kreditkartenschulden
	//Der Betrag kann nur so hoch sein wie die aktuellen Kreditkartenschulden.
	//Ist der Betrag höher, wird der Schuldenstand auf 0 gesetzt
	
	double deposit(double amount) {
		
		double deposit = 0;
	
		if (balance - amount < 0) {
			balance = 0;
			deposit = amount - balance;
		} else {
			balance -= amount;
		}
		return deposit;
	}
	//Methode toString: gibt die Kontoinformationen als String zurück
	
	public String toString() {
		
		return "Card owner: " + fullName + " Card number: " + cardNumber + " Balance: " + balance + " Limit: " + limit;
	}
}
