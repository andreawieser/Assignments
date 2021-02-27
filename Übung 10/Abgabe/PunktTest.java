public class PunktTest {
	
	public static void main (String[] args) {
		
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt(-4);
		Punkt p3 = new Punkt(-4, 3);
		Punkt p4 = new Punkt(p3);
		Out.println("p1: " + p1);
		Out.println("p2: " + p2);
		Out.println("p3: " + p3);
		Out.println("p4: " + p4);
		Out.println("distance between " + p1 + " and " + p2 + ": " + p1.distanceTo(p2));
		Out.println("distance between " + p1 + " and " + p3 + ": " + p1.distanceTo(p3));
		Out.println("distance between " + p2 + " and " + p3 + ": " + p2.distanceTo(p3));
	}
}
