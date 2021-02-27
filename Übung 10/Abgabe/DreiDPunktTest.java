public class DreiDPunktTest {
	
	public static void main (String[] args) {
		
		DreiDPunkt p1 = new DreiDPunkt();
		DreiDPunkt p2 = new DreiDPunkt(-4, 3);
		DreiDPunkt p3 = new DreiDPunkt(-4, 3, 4);
		DreiDPunkt p4 = new DreiDPunkt(p3);
		Out.println("p1: " + p1);
		Out.println("p2: " + p2);
		Out.println("p3: " + p3);
		Out.println("p4: " + p4);
		p3 = null;
		DreiDPunkt p5 = new DreiDPunkt(p3);
		Out.println("p5: " + p5);
		double distance = p1.distanceTo(p2);
		Out.println("Distance between " + p1 + " and " + p2 + " = " + distance);
		p2.setZ(4);
		distance = p1.distanceTo(p2);
		Out.println("Distance between " + p1 + " and " + p2 + " = " + distance);
	}
}
