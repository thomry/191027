package classproj;

public class Rect {
	
	// field
	private int width;
	private int height;
	private boolean isSquare;
	
	// Constructor
	public Rect(int width, int height) {
		this.width  = width;
		this.height = height;
		this.isSquare = (width == height) ? true : false;
	}
	
	// Method
	// 1. Getter
	public int getWidth()     { return width; }
	public int getHeight()    { return height; }
	public boolean isSquare() { return isSquare; }
	
	// 2. Setter
	public void setWidth(int width) { 
		if (width <= 100) {
			this.width = width;
			setSquare();
		}
	}
	public void setHeight(int height) {
		if (height > 100) {
			return;
		}
		this.height = height;
		setSquare();
	}
	private void setSquare()          { this.isSquare = (width == height) ? true:false; }
	
	// 3. 일반 method
	public void output() {
		System.out.println("너비= "+width);
		System.out.println("높이= "+height);
		System.out.println("크기= "+calcArea());
	}
	private int calcArea() { return width * height; }

}
