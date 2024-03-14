package nadiaproject1;

public class volume_tabung {

	public static void main(String[] args) {
		/*
		 volume = phi*r*r*tinggi;
		 r = jari jari / radius
		 */
		 double diameter = 5;
		 double radius = diameter / 2;
		 double tinggi = 10;
		 
		 double volume = Math.PI * radius * radius * tinggi;
		 
		 System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 = " + volume);

	}

}
