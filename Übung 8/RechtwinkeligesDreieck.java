public class RechtwinkeligesDreieck {
	
	public static double round(double val) {
		return (double) Math.round(val * 100) / 100;
	}
	public static void main (String[] args) {
		
		RightAngledTriangle r1 = new RightAngledTriangle();
		RightAngledTriangle r2 = new RightAngledTriangle(5.0, 7.0);
		RightAngledTriangle r3 = new RightAngledTriangle(r2);
		Out.println("Area of r1: " + r1.area());
		Out.println("Perimeter of r2: " + round(r2.perimeter()));
		Out.println("Hypothenuse of r3: " + round(r3.calculateHypothenuse()));
	}
}
