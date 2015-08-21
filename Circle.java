package circle;

public class Circle {
	
	public final double DEFAULT_RADIUS = 8.8;
	public final String DEFAULT_COLOR = "red";
	
	
	private double radius;
	private String color;
	

	public Circle()   //1st constructor
	{
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
		
	}
	public Circle(double radius)  //2nd Constructor
	{
		this.radius = radius;
		color = DEFAULT_COLOR;
	}
	public Circle(double radius, String color)  //3rd Constructor
	{
		
		this.radius = radius;
		this.color = color;
	}
	
	
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	 public String toString() {
		   return "Circle with radius = " + radius + " and color of " + color;
		}

}
