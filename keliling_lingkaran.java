package nadiaproject1;

public class keliling_lingkaran {

	public static void main(String[] args) {
		 /*
		 keliling = phi*diameter atau 2*phi*r
		 d = 2*r
		 r = jari jari / radius
		 */
		 double diameter = 10;
		 double radius = diameter / 2;
		 
		 double keliling = 2 * Math.PI * radius;
		 
		 System.out.println("Keliling lingakaran dengan diameter 10 = " + keliling);
	}

}