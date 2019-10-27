package classproj;

public class CoordinateCircleMain {

	public static void main(String[] args) {
		
		Coordinate center = new Coordinate();			// (0,0)
		Circle     won    = new Circle(center, 1.5);
		
		center.setX(10);			// x좌표 수정
		center.setY(10);			// y좌표 수정
		
		won.setCenter(center);		// 수정된 center 사용
		won.setRadius(2.5);			// 반지름수정
		
		won.output();				// 중심좌표(10, 10), 크기:

	}

}
