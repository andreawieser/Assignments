public class Punkt {
	
	//x- und y-Koordinate
	
	public double x = 0;
	public double y = 0;
	
	//4 Konstruktoren
	
	public Punkt() {
		
		this(0, 0);
	}
	public Punkt(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	public Punkt(double x) {
		
		this.x = x;
	}
	public Punkt(Punkt p) {
		
		if (p != null) {
			this.x = p.x;
			this.y = p.y;
		} else {
			this.x = 1;
			this.y = 1;
		}
	}
	//get-Methoden
	
	protected double getX() {
		
		return x;
	}
	protected double getY() {
		
		return y;
	}
	//set-Methoden
	protected void setX(double x) {
		
		this.x = x;
	}
	protected void setY(double y) {
		
		this.y = y;
	}
	//Methode zur Distanzberechnung
	
	public double distanceTo (Punkt p) {
		
		double p1 = p.getX();
		double p2 = p.getY();
		double result1 = (p1 - this.x) * (p1 - this.x);
		double result2 = (p2 - this.y) * (p2 - this.y);
		double result = Math.sqrt(result1 + result2); 
		result = Math.round(result * 100) / 100;
		return result;
	}
	//textuelle Darstellung
	
	public String toString() {
		
		return "(" + x + "/" + y + ")";
	}
}
