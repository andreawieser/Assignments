public class DreiDPunkt extends Punkt {
	
	//z-Koordinate
	
	private double z = 0;
	
	//Konstruktoren
	
	DreiDPunkt() {
		
		super(0,0);
		this.z = 0;
	}
	DreiDPunkt(double x, double y, double z) {
		
		super(x,y);
		this.z = z;
	}
	DreiDPunkt(double x, double y) {
		
		super(x,y);
	}
	DreiDPunkt(double x) {
		
		super(x);
	}
	DreiDPunkt(DreiDPunkt p) {
		
		if (p != null) {
			this.z = p.z;
		} else {
			this.z = 1;
		}
	}
	//get-Methode

	public double getZ() {
		
		return z;
	}
	//set-Methoden
	
	public void setZ(double z) {
		
		this.z = z;
	}
	//Methode zur Distanzberechnung
	
	public double distanceTo (DreiDPunkt p) {
		
		double p1 = p.getX();
		double p2 = p.getY();
		double p3 = p.getZ();
		double result1 = (p1 - this.x) * (p1 - this.x);
		double result2 = (p2 - this.y) * (p2 - this.y);
		double result3 = (p3 - this.z) * (p3 - this.z);
		double result = Math.sqrt(result1 + result2 + result3); 
		return result;
	}
	//textuelle Darstellung
	
	public String toString() {
		
		return "(" + x + "/" + y + "/" + z + ")";
	}
}
