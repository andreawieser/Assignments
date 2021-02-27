public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Miriam", "Musterfrau", 27);
		Person p3 = new Person("Michael", "Vierhauser", -69);
		
		Out.println(p1);
		Out.println(p2);
		Out.println(p3);
		
		p1.setLastName("Testperson");
		p1.setFirstName("Tanja");
		p1.setAge(23);
		
		Out.println(p1);
	}
}
