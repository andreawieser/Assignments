public class RightAngledTriangle {
	
	//Instanzvariablen
	
	double a;
	double b;
	
	//Konstruktor 1: parameterlos, intialisiert das Dreieck mit den Seitenlängen jeweils 1
	
	RightAngledTriangle() {
		
		a = 1;
		b = 1;
	}
	//Konstruktor 2, der die beiden Seitenlängen als Parameter entgegen nimmt
	
	RightAngledTriangle(double lengthA, double lengthB) {
		
		if (lengthA < 0 || lengthB < 0) {
			a = 1;
			b = 1;
		} else {
			a = lengthA;
			b = lengthB;
		}
	}
	//Konstruktor 3, nimmt ein RightAngledTriangle-Objekt als Parameter entgegen und intialisiert das Dreieck mit denselben Seitenlängen. 
	//(Ist der Parameter null, soll ein Dreieck mit den Seitenlängen 1 erzeugt werden)
	
	RightAngledTriangle(RightAngledTriangle x) {
		
		if (x == null || a < 0 || b < 0) {
			x.a = 1;
			x.b = 1;
		} else {
			a = x.a;
			b = x.b;
		}
	}
	//Methode area: berechnet den Flächeninhalt des Dreiecks und gibt diesen als double-Wert zurück
	
	double area() {
		
		double area = (a * b) / 2;
		return area;
	}
	//Methode perimeter: berechnet den Umfang des Dreiecks und gibt diesen als double Wert zurück
	
	double perimeter() {
		
		double perimeter = a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		return perimeter;
	}
	//Methode calculateHypothenuse: berechnet die Hypothenuse des rechtwinkeligen Dreiecks
	
	double calculateHypothenuse() {
		
		double hypothenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		return hypothenuse;
	}
}
