package classproj;

public class Circle {
	
	// Field
	private Coordinate center;	// 좌표 (x,y)
	private double     radius;	// 반지름
	
	// Constructor
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	// Method
	public void setCenter(Coordinate center) { this.center = center; }
	public void setRadius(double radius)     { this.radius = radius; }
	public void output() {
		System.out.println("중심좌표 = ["+center.getX()+", "+center.getY()+"]");
		System.out.println("크기      = "+calcArea());
	}
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
