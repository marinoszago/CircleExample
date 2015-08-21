package circle;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c1 =new Cylinder();
		System.out.println("radius is " + c1.getRadius() + "Height is "+ c1.getHeight() + "color is "+c1.getColor()+"Area is "+c1.getArea()+"Volume is "+c1.getVolume());
		
		Cylinder c2 = new Cylinder(5.0,3.0,"blue");
		System.out.println("radius is " + c2.getRadius() + "Height is "+ c2.getHeight() + "color is "+c2.getColor()+"Area is "+c2.getArea()+"Volume is "+c2.getVolume());
		

	}

}
