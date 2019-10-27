package classproj;

public class RectMain {

	public static void main(String[] args) {
		
		// class Rect(private, public)의 외부이므로 public만 보임
		
		Rect nemo = new Rect(1,2);
		nemo.output();
		
		nemo.setWidth(2);
		nemo.output();
		
		nemo.setHeight(3);
		nemo.output();

	}

}
