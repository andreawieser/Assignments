public class Kreditkarte {
	
	public static void main (String[] args) {
		
		Account cc1 = new Account();
		Account cc2 = new Account(987651234, "Jane Smith", 400, 1000.0);
		Out.println("Balance of cc1 " + cc1.getBalance());
		Out.println("CC1 is 2000 Covered? " + cc1.isCovered(2000));
		cc1.pay(2000);
		Out.println("Balance of cc1 " + cc1.getBalance());
		Out.println("CC1 is 200 Covered? " + cc1.isCovered(200));
		cc1.pay(200);
		Out.println("Balance of cc1 " + cc1.getBalance());
		Out.println("");
		Out.println("Balance of cc2 " + cc2.getBalance());
		cc2.pay(500.0);
		Out.println("Balance of cc2 " + cc2.getBalance());
		cc2.deposit(700);
		Out.println("cc2: " + cc2.toString());
	}
}
