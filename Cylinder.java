package circle;

public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder()
	{
		super();
		height=1.0;
	}
	
	public Cylinder(double radius,double height,String color)
	{
		super(radius,color);
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return getArea()*height;
	}
}
	
	
